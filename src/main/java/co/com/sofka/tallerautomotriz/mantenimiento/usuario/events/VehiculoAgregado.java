package co.com.sofka.tallerautomotriz.mantenimiento.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.VehiculoId;

public class VehiculoAgregado extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Matricula matricula;

    public VehiculoAgregado(VehiculoId vehiculoId,Matricula matricula) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.VehiculoAgregado");
        this.vehiculoId = vehiculoId;
        this.matricula = matricula;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Matricula getMatricula() {
        return matricula;
    }


}
