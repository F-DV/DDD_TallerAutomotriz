package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Factura;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Repuesto;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.OrdenServicioId;

public class OrdenCreada extends DomainEvent {

    private final OrdenServicioId ordenServicioId;
    private final Factura factura;
    private final Repuesto repuesto;


    public OrdenCreada(OrdenServicioId ordenServicioId, Factura factura, Repuesto repuesto) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.OrdenCreada");
        this.ordenServicioId = ordenServicioId;
        this.factura = factura;
        this.repuesto = repuesto;
    }


    public OrdenServicioId getOrdenServicioId() {
        return ordenServicioId;
    }


    public Factura getFactura() {
        return factura;
    }


    public Repuesto getRepuesto() {
        return repuesto;
    }


    


    

}
