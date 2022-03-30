package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.Especialidad;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.Servicio;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Nombre;


public class TecnicoCreado extends DomainEvent{

    private final Nombre nombre;
    private final Especialidad especialidad;
    private final Servicio servicio;

    public TecnicoCreado(Nombre nombre, Especialidad especialidad, Servicio servicio) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.TecnicoCreado");
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.servicio = servicio;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Servicio getServicio() {
        return servicio;
    }
    

    

   
    

    
    
    
}
