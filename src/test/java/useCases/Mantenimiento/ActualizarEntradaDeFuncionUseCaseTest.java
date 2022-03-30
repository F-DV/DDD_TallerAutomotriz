package useCases.Mantenimiento;

import org.junit.jupiter.api.Test;


import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Funcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada.Tipo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Descripcion;

public class ActualizarEntradaDeFuncionUseCaseTest {
    @Test
    void actualizarEntradaDeFuncion() {
        
        FuncionId funcionId = new FuncionId();
        Entrada entrada = new Entrada(Tipo.CONLAFALLAPRESENTE);
        Descripcion descripcion = new Descripcion("value");

        Funcion funcion = new Funcion(funcionId, entrada, descripcion);

    }
}
