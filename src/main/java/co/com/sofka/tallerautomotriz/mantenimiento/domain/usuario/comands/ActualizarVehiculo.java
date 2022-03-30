package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.UsuarioId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.VehiculoId;

public class ActualizarVehiculo extends Command {

    private final UsuarioId usuarioId;
    private final VehiculoId vehiculoId;

    public ActualizarVehiculo(UsuarioId usuarioId, VehiculoId vehiculoId) {
        this.usuarioId = usuarioId;
        this.vehiculoId = vehiculoId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }
}
