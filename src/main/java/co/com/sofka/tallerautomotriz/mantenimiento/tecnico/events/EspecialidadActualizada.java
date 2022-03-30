package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;

public class EspecialidadActualizada extends DomainEvent{

    private final EspecialidadId especialidadId;
    private final Cargo cargo;
    private final Tarifa tarifa;

    public EspecialidadActualizada(EspecialidadId especialidadId,Cargo cargo,Tarifa tarifa) {

        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.EspecialidadActualizada");
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
