package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Fecha;

public class CrearFechaDeFactura extends Command{
    
    private final FacturaId facturaId;
    private final Fecha fecha;

    public CrearFechaDeFactura(FacturaId facturaId, Fecha fecha) {
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
