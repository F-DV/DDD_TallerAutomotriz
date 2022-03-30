package useCases.Mantenimiento;

import javax.smartcardio.Card;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Especialidad;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo.Tipo;

public class AgregarEspecialidadUseCaseTest {
    
    @Test
    void agregarEspecialidad() {

        EspecialidadId entityId = new EspecialidadId();
        Cargo cargo = new Cargo(Tipo.CARROCERO);
        Tarifa tarifa = new Tarifa(3.000);

        Especialidad especialidad = new Especialidad(entityId, cargo, tarifa);
    }
}
