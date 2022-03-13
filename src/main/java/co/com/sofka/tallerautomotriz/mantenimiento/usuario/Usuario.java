package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.UsuarioId;

public class Usuario extends AggregateEvent<UsuarioId> {

    public Usuario(UsuarioId entityId) {
        super(entityId);
    }
}
