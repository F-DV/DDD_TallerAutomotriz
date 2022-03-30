package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Fecha;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Valor;

public class FacturaCreada extends DomainEvent {
   
    private final FacturaId facturaId;
    private final Fecha fecha;
    private final Valor valor;

    public FacturaCreada(FacturaId facturaId, Fecha fecha, Valor valor) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.FacturaCreada");
        this.facturaId = facturaId;
        this.fecha = fecha;
        this.valor = valor;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Valor getValor() {
        return valor;
    }

    


    
}
