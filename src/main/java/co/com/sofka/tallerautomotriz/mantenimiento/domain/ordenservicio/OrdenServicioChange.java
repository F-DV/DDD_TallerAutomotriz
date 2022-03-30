package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.FacturaCreada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.MantenimientoCreado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.OrdenCreada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.RepuestoAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.ValorDeFacturaCreado;

public class OrdenServicioChange extends EventChange {
    public OrdenServicioChange(OrdenServicio ordenServicio) {

        apply((FacturaCreada event) -> {
            ordenServicio.factura = new Factura(
                event.getFacturaId(),
                event.getValor(),
                event.getFecha()
            ); 
        });

        apply((MantenimientoCreado event) -> {
            ordenServicio.mantenimiento = new Mantenimiento(
                event.getMantenimientoId(), 
                event.getTipo());
        });

        apply((RepuestoAgregado event) -> {
            ordenServicio.repuesto = new Repuesto(
                event.getRepuestoId(),
                event.getDescripcion()
            );
        });
    }
}
