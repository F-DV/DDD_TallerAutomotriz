package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Funcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands.ActualizarEntradaDeFuncion;


public class ActualizarEntradaDeFuncionUseCase extends UseCase<RequestCommand<ActualizarEntradaDeFuncion>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<ActualizarEntradaDeFuncion> input) {

       ActualizarEntradaDeFuncion actualizarEntradaDeFuncion = input.getCommand();

        Funcion funcion = new Funcion(actualizarEntradaDeFuncion.getFuncionId(), actualizarEntradaDeFuncion.getEntrada(), actualizarEntradaDeFuncion.getDescripcion());

        emit().onResponse(new ResponseEvents(funcion.getUncommittedChanges()));
        
        
    }
    
}
