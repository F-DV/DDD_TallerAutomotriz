package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Fecha;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Valor;

public class CrearFactura extends Command{

    private final FacturaId facturaId;
    private final Fecha fecha;
    private final Valor valor;

    public CrearFactura(FacturaId facturaId, Fecha fecha, Valor valor) {
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
