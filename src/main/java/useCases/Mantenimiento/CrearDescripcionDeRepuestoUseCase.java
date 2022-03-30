package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Repuesto;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearDescripcionDeRepuesto;

public class CrearDescripcionDeRepuestoUseCase  extends UseCase<RequestCommand<CrearDescripcionDeRepuesto>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CrearDescripcionDeRepuesto> input) {
        
        CrearDescripcionDeRepuesto crearDescripcionDeRepuesto = input.getCommand();

        Repuesto repuesto = new Repuesto(crearDescripcionDeRepuesto.getRepuestoId(),crearDescripcionDeRepuesto.getDescripcion());

        emit().onResponse(new ResponseEvents(repuesto.getUncommittedChanges()));

        
    }
    
}
