package useCases.Mantenimiento;

import org.testng.internal.annotations.FactoryAnnotation;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Factura;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearFactura;

public class CrearFacturaUseCase extends UseCase<RequestCommand<CrearFactura>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CrearFactura> input) {

        CrearFactura crearFactura = input.getCommand();

        Factura factura = new Factura(crearFactura.getFacturaId(),crearFactura.getValor(),crearFactura.getFecha())

        emit().onResponse(new ResponseEvents(factura.getUncommittedChanges()));

    }
    
}
