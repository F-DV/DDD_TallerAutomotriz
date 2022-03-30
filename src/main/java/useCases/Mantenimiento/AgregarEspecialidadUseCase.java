package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Especialidad;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands.AgregarEspecialidad;

public class AgregarEspecialidadUseCase extends UseCase<RequestCommand<AgregarEspecialidad>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<AgregarEspecialidad> input) {
        
        AgregarEspecialidad agregarEspecialidad = input.getCommand();

        Especialidad especialidad = new Especialidad(agregarEspecialidad.getEspecialidadId(),agregarEspecialidad.getCargo(),agregarEspecialidad.getTarifa());
        
        emit().onResponse(new ResponseEvents(especialidad.getUncommittedChanges()));
    }
    
    
}
