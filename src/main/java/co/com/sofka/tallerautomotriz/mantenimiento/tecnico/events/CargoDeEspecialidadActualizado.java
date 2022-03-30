package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;

public class CargoDeEspecialidadActualizado extends DomainEvent{
    
    private final EspecialidadId especialidadId;
    private final Cargo cargo;

    
    public CargoDeEspecialidadActualizado(EspecialidadId especialidadId, Cargo cargo){
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.CargoDeEspecialidadActualizado");
        this.especialidadId = especialidadId;
        this.cargo = cargo; 
    }


    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }


    public Cargo getCargo() {
        return cargo;
    }

    
}
