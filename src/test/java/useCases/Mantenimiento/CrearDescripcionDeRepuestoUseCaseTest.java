package useCases.Mantenimiento;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearDescripcionDeRepuesto;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.RepuestoId;

public class CrearDescripcionDeRepuestoUseCaseTest {
    
    
    @Test
    void agregarDescripcionDeRepuesto() {

        RepuestoId repuestoId = new RepuestoId();
        Descripcion descripcion = new Descripcion("Bomba de agua");
        CrearDescripcionDeRepuesto crearDescripcionDeRepuesto = new CrearDescripcionDeRepuesto(repuestoId, descripcion);     

    }
}
