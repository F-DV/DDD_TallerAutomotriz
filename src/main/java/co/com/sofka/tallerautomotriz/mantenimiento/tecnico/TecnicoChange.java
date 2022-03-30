package co.com.sofka.tallerautomotriz.mantenimiento.tecnico;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EspecialidadActualizada;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EspecialidadAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.ServicioActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.ServicioAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.TecnicoCreado;




public class TecnicoChange extends EventChange{

        /*
   Aqui aplicamos cada evento de domino que tenemos en este agregado Tecnico
   podemos colocar tambien validaciones, reglas de dominio
    */
    public TecnicoChange(Tecnico tecnico){

        apply((TecnicoCreado event) -> {                    //Inicializa los atributos que se usan en el comportamiento que lanza ESTE evento
            tecnico.nombre = event.getNombre();
            tecnico.especialidad = event.getEspecialidad();
            tecnico.servicio = event.getServicio();
                
        });

        apply((EspecialidadAgregada event) -> {
            tecnico.especialidad = new Especialidad(
                event.getEspecialidadId(), 
                event.getCargo(), 
                event.getTarifa());
 
        });
        apply((EspecialidadActualizada event) -> {
            tecnico.especialidad = new Especialidad(
                event.getEspecialidadId(), 
                event.getCargo(), 
                event.getTarifa());
 
        });
        apply((ServicioAgregado event) -> {
            tecnico.servicio = new Servicio(
                event.getServicioId(), 
                event.getEstado());
            });
        apply((ServicioActualizado event) -> {
            tecnico.servicio = new Servicio(
                event.getServicioId(), 
                event.getEstado());
            });   

    }
    
}
