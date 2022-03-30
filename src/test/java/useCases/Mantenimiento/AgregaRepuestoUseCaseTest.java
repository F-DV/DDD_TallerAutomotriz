package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.AgregaRepuesto;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.RepuestoId;

public class AgregaRepuestoUseCaseTest {
    
    @Test
    void agregarRepuesto() {

        RepuestoId repuestoId = new RepuestoId().of("xxx");
        Descripcion descripcion = new Descripcion("turbo");
        
        AgregaRepuesto agregaRepuesto = new AgregaRepuesto(repuestoId, descripcion);


    }
}
