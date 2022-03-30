package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.UsuarioId;

public class ActualizarTipoDeUsuario extends Command {

    private final UsuarioId usuarioId;
    private final TipoUsuario tipoUsuario;

    public ActualizarTipoDeUsuario(UsuarioId usuarioId, TipoUsuario tipoUsuario) {
        this.usuarioId = usuarioId;
        this.tipoUsuario = tipoUsuario;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
}
