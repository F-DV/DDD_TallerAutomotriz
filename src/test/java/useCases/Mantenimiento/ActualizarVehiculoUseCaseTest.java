package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Vehiculo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.VehiculoId;

public class ActualizarVehiculoUseCaseTest {
    
    
    @Test
    void actualizarVehiculo() {

        VehiculoId vehiculoId = new VehiculoId();
        Matricula matricula = new Matricula("juo452", "mazda", "6", "Blanco");

        Vehiculo vehiculo = new Vehiculo(vehiculoId,matricula);
    }
}
