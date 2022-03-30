package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;

public class EspecialidadAgregada extends DomainEvent{

    private final EspecialidadId especialidadId;
    private final Cargo cargo;
    private final Tarifa tarifa;


    public EspecialidadAgregada(EspecialidadId especialidadId, Cargo cargo, Tarifa tarifa) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.EspecialidadAgregada");
        this.especialidadId = especialidadId;
        this.cargo = cargo;
        this.tarifa = tarifa;   
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    

    
    
    
}
