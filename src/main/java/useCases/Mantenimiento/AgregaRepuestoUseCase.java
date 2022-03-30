package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Repuesto;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.AgregaRepuesto;

public class AgregaRepuestoUseCase extends UseCase<RequestCommand<AgregaRepuesto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregaRepuesto> input) {
        AgregaRepuesto agregaRepuesto = input.getCommand();

        Repuesto repuesto = new Repuesto(agregaRepuesto.getRepuestoId(), agregaRepuesto.getDescripcion());
        emit().onResponse(new ResponseEvents(repuesto.getUncommittedChanges()));

    }


    
}
