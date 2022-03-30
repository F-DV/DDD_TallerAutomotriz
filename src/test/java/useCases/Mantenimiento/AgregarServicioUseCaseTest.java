package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Servicio;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.ServicioId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado.Tipo;

public class AgregarServicioUseCaseTest {
    @Test
    void agregarServicio() {

        ServicioId servicioId = new ServicioId();
        Estado estado = new Estado(Tipo.TERMINADO);
        Servicio servicio = new Servicio(servicioId, estado);
    }
}
