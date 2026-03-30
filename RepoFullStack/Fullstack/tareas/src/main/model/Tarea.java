package cl.yanez.model;

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

    @id
    @NotNull
    private integer id;

    @NotBlank
    private String nombre;

    @id
    @NotNull
    private integer fecha;

    @NotBlank
    private String descripcion;

    @id
    @NotNull
    private integer puntaje;

}
