package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.TecnicoId;

public class NombreAñadido extends DomainEvent{
    
    private final TecnicoId tecnicoId;
    private final Nombre nombre;

    public NombreAñadido(TecnicoId tecnicoId, Nombre nombre){
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.NombreAñadido");
        this.tecnicoId = tecnicoId;
        this.nombre = nombre;

    }

    public TecnicoId getTecnicoId() {
        return tecnicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    

}
