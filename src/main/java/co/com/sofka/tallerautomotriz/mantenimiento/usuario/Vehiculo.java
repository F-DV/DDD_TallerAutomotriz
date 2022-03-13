package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.VehiculoId;

public class Vehiculo extends Entity<VehiculoId> {

    public Vehiculo(VehiculoId entityId) {
        super(entityId);
    }
}
