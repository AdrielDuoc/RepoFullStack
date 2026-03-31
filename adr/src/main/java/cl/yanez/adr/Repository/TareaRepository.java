package cl.yanez.adr.Repository;

import cl.yanez.adr.Model.Tarea;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public class TareaRepository {

    public List<Tarea> ListaTareas = new ArrayList<>();

    public List<Tarea> ObtenerLibro(){
        return ListaTareas;
    }

    public Tarea BuscarPorId(int id){
        for (Tarea tarea : ListaTareas){
            if(tarea.getId() == id){
                return tarea;
            }
        }
        return null;
    }

    public Tarea guardar(Tarea Tar){
        ListaTareas.add(Tar);
        return Tar;
    }

    public Tarea actualizar(Tarea Tar){
        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < ListaTareas.size(); i++){
            if (ListaTareas.get(i).getId() == Tar.getId()){
                id = Tar.getId();
                idPosicion = i;
            }
        }

        Tarea tarea1 = new Tarea();
        tarea1.setId(id);
        tarea1.setNombre(Tar.getNombre());
        tarea1.setCategoria(Tar.getCategoria());
        tarea1.setPuntaje(Tar.getPuntaje());

        ListaTareas.set(idPosicion, tarea1);
        return tarea1;
        
    }

    public void eliminar(int id){
        Tarea tarea = BuscarPorId(id);
        if(tarea != null){
            ListaTareas.remove(tarea);
        }

        int idPosicion = 0;
        for (int i = 0; i < ListaTareas.size();i++){
            if (ListaTareas.get(i).getId()==id){
                idPosicion = i;
                break; 
            }
        }

        if (idPosicion > 0){
            ListaTareas.remove(idPosicion);

        }

        ListaTareas.removeIf(x -> x.getId() == id);

        
    }

}
