package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Mantenimiento;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearMantenimiento;

public class CrearManteniminetoUseCase extends UseCase<RequestCommand<CrearMantenimiento>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CrearMantenimiento> input) {
        
        CrearMantenimiento crearMantenimiento = input.getCommand();                                                         //El comando biene del input

        Mantenimiento mantenimiento  = new Mantenimiento(crearMantenimiento.getMantenimientoId(),crearMantenimiento.getTipo());//Creamos el mantenimiento con los argumentos que tiene CrearMantenimiento
        // si algun argumento de Mantenimiento cambia, Cambiamos el comando
        emit().onResponse(new ResponseEvents(mantenimiento.getUncommittedChanges())); // si se cuemple, emitimos un mensaje exitoso, una respuesta de eventos
    
    }


    
}
