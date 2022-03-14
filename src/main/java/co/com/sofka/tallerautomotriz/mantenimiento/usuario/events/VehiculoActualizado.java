package co.com.sofka.tallerautomotriz.mantenimiento.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.Vehiculo;

public class VehiculoActualizado extends DomainEvent {

    private final Vehiculo vehiculo;

    public VehiculoActualizado(Vehiculo vehiculo) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.vehiculoactualizado");
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
