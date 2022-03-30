package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Especialidad;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo.Tipo;

public class ActualizarEspecialidadUseCaseTest {
   
    @Test
    void actualizarEspecialidad() {
        
        EspecialidadId entityId = new EspecialidadId();
        Cargo cargo = new Cargo(Tipo.ELECTRICISTA);
        Tarifa tarifa = new Tarifa(500.0);

        Especialidad especialidad = new Especialidad(entityId, cargo, tarifa);
    }
}
