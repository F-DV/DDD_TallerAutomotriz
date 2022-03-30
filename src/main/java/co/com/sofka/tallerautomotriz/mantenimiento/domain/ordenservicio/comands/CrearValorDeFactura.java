package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Valor;

public class CrearValorDeFactura extends Command {
    
    private final FacturaId facturaId;
    private final Valor valor;

    public CrearValorDeFactura(FacturaId facturaId, Valor valor) {
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
