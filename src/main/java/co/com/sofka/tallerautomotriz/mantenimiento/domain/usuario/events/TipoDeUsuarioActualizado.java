package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;

public class TipoDeUsuarioActualizado extends DomainEvent {

    private final TipoUsuario tipoUsuario;

    public TipoDeUsuarioActualizado(TipoUsuario tipoUsuario) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.tipodeusuarioactualizado");
        this.tipoUsuario = tipoUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
}
