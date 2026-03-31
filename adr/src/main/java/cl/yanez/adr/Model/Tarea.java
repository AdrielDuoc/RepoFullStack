package cl.yanez.adr.Model;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    @Id
    @NotNull
    private Integer id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String categoria;

    @NotNull
    private Integer puntaje;
}