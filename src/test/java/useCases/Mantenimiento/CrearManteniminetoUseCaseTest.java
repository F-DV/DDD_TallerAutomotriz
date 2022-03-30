package useCases.Mantenimiento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands.CrearMantenimiento;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events.MantenimientoCreado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.MantenimientoId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Tipo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Tipo.Mantto;

public class CrearManteniminetoUseCaseTest {
   
   
    @Test
    void crearMantenimiento() {
        //arrange ( Es trabajar un Comando)
        MantenimientoId mantenimientoId = MantenimientoId.of("xxxx");       //Creamos un id a partir de una cadena, es lo que se hace con of que es un patron
        Tipo tipo = new Tipo(Mantto.PREVENTIVO);
    
        CrearMantenimiento crearMantenimiento = new CrearMantenimiento(mantenimientoId, tipo);
        
        
        //act (Se hace a travez de un handle , es un patron comman, la ejecucion de un comando u orden)
        //.getInstance() es un singleton y se puede ejecutar de dos formas, sincrona y asincrona

        CrearManteniminetoUseCase useCase = new CrearManteniminetoUseCase();        //creamos el caso de uso ya que lo necesita la forma sincrona

        var events = UseCaseHandler.getInstance()
            .syncExecutor(useCase, new RequestCommand<>(crearMantenimiento))   //La forma sincrona , necesita el caso de uso y sus valores
            .orElseThrow()
            .getDomainEvents();
        
        
        //assert (Es para comparar)

        var event = (MantenimientoCreado)events.get(0);                 //MantenimientoCreado es el evento que me deberia llegar
        Assertions.assertEquals("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.MantenimientoCreado", event.type);
        Assertions.assertEquals("xxxx", event.getMantenimientoId());


    }
}
