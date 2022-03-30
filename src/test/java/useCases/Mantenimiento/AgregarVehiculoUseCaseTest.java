package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Vehiculo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.VehiculoId;

public class AgregarVehiculoUseCaseTest {
    
    @Test
    void agregarVehiculo() {

        VehiculoId vehiculoId = new VehiculoId();
        Matricula matricula = new Matricula("nmp458", "renault", "clio", "Blanco");

        Vehiculo vehiculo = new Vehiculo(vehiculoId,matricula);
    }
}
