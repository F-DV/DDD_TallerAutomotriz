package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;

public class TipoDeUsuarioAgregado extends DomainEvent {

    private final TipoUsuario tipoUsuario;

    public TipoDeUsuarioAgregado(TipoUsuario tipoUsuario) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.tipodeusuarioagregado");
        this.tipoUsuario = tipoUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
}
