package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Funcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands.AgregarEntradaDeFuncion;

public class AgregarEntradadeFuncionUseCase extends UseCase<RequestCommand<AgregarEntradaDeFuncion>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<AgregarEntradaDeFuncion> input) {
       
        AgregarEntradaDeFuncion agregarEntradaDeFuncion = input.getCommand();

        Funcion funcion = new Funcion(agregarEntradaDeFuncion.getFuncionId(), agregarEntradaDeFuncion.getEntrada(), agregarEntradaDeFuncion.getDescripcion());

        emit().onResponse(new ResponseEvents(funcion.getUncommittedChanges()));
        
    }
    
}
