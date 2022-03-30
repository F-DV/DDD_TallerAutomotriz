package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Fecha;

public class FechaDeFacturaCreada extends DomainEvent {

    private final FacturaId facturaId;
    private final Fecha fecha;

    public FechaDeFacturaCreada(FacturaId facturaId, Fecha fecha) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.FechaDeFacturaCreada");
        this.facturaId = facturaId;
        this.fecha = fecha;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    
    
}
