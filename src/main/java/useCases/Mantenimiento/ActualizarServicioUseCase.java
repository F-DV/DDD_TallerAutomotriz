package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Servicio;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands.AgregarServicio;

public class ActualizarServicioUseCase extends UseCase<RequestCommand<AgregarServicio>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<AgregarServicio> input) {
        
        AgregarServicio agregarServicio = input.getCommand();

        Servicio servicio = new Servicio(agregarServicio.getServicioId(), agregarServicio.getEstado());
        emit().onResponse(new ResponseEvents(servicio.getUncommittedChanges()));
        
    }
    
}
