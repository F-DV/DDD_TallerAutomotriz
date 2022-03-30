package useCases.Mantenimiento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Factura;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearFactura;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Fecha;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Valor;

public class CrearFacturaUseCaseTest {
    
    @Test
    void crearFactura() {

        FacturaId facturaId = new FacturaId();
        Valor valor = new Valor(3.500);
        Fecha fecha = new Fecha("02-02-2022");

        Factura factura = new Factura(facturaId, valor, fecha);

    

    }
}
