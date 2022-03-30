package useCases.Mantenimiento;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Vehiculo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands.AgregarVehiculo;

public class ActualizarVehiculoUseCase extends UseCase<RequestCommand<AgregarVehiculo>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<AgregarVehiculo> input) {

        AgregarVehiculo agregarVehiculo = input.getCommand();

        Vehiculo vehiculo = new Vehiculo(agregarVehiculo.getVehiculoId(), agregarVehiculo.getMatricula());

        emit().onResponse(new ResponseEvents(vehiculo.getUncommittedChanges()));
        
    }

    
}
