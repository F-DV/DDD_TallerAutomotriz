package co.com.sofka.tallerautomotriz.mantenimiento.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.Vehiculo;

public class VehiculoAgregado extends DomainEvent {

    private final Vehiculo vehiculo;

    public VehiculoAgregado(Vehiculo vehiculo) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.VehiculoAgregado");
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
