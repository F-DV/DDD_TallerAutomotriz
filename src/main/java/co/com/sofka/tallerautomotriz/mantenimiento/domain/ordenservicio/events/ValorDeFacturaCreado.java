package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Valor;

public class ValorDeFacturaCreado extends DomainEvent {
    
    private final FacturaId facturaId;
    private final Valor valor;

    public ValorDeFacturaCreado(FacturaId facturaId, Valor valor) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.ValorDeFacturaCreado");
        this.facturaId = facturaId;
        this.valor = valor;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Valor getValor() {
        return valor;
    }
}
