package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;

public class TarifaDeEspecialidadAñadido extends DomainEvent {
    
    private final EspecialidadId especialidadId;
    private final Tarifa tarifa;
    private final Cargo cargo;

    
    public TarifaDeEspecialidadAñadido(EspecialidadId especialidadId, Tarifa tarifa, Cargo cargo){
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.");
        this.especialidadId = especialidadId;
        this.tarifa = tarifa;
        this.cargo = cargo;
    }


    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }


    public Tarifa getTarifa() {
        return tarifa;
    }


    public Cargo getCargo() {
        return cargo;
    }

}
