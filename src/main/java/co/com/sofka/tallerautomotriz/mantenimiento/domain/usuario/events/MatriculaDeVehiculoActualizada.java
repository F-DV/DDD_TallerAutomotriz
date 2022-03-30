package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.VehiculoId;

public class MatriculaDeVehiculoActualizada extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Matricula matricula;

    public MatriculaDeVehiculoActualizada(VehiculoId vehiculoId, Matricula matricula) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.Matriculadevehiculoactualizado");
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
