package co.com.sofka.tallerautomotriz.mantenimiento.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Nombre;

public class NombreCambiado extends DomainEvent {
    private final Nombre nombre;

    public NombreCambiado(Nombre nombre) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
