package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.events.DescripcionAgregada;

public class OrdenChange extends EventChange {
    public OrdenChange(OrdenServicio ordenServicio) {

        apply((DescripcionAgregada event) -> {
            ordenServicio.descripcion = event.getDescripcion();
        });
    }
}
