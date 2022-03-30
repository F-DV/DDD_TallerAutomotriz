package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.UsuarioId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.VehiculoId;

public class AgregarVehiculo extends Command {

    private final UsuarioId usuarioId;
    private final VehiculoId vehiculoId;
    private final Matricula matricula;

    public AgregarVehiculo(UsuarioId usuarioId, VehiculoId vehiculoId, Matricula matricula) {
        this.usuarioId = usuarioId;
        this.vehiculoId = vehiculoId;
        this.matricula = matricula;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Matricula getMatricula() {
        return matricula;
    }
}
