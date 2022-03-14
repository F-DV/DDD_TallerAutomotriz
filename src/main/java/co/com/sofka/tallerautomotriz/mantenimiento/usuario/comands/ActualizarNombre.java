package co.com.sofka.tallerautomotriz.mantenimiento.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.UsuarioId;

public class ActualizarNombre extends Command {

    private final UsuarioId usuarioId;
    private final Nombre nombre;

    public ActualizarNombre(UsuarioId usuarioId, Nombre nombre) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
