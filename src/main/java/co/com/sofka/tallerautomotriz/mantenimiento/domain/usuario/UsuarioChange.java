package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events.FuncionAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events.UsuarioCreado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events.VehiculoActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events.VehiculoAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;

import java.util.HashSet;

public class UsuarioChange extends EventChange {
    /*
   Aqui aplicamos cada evento de domino que tenemos en este agregado usuario
   podemos colocar tambien validaciones, reglas de dominio
    */
    public UsuarioChange(Usuario usuario) {
        apply((UsuarioCreado event) -> {                    //Inicializa los atributos que se usan en el comportamiento que lanza ESTE evento
            usuario.nombre = event.getNombre();
            usuario.tipoUsuario = event.getTipoUsuario();
            usuario.vehiculo = event.getVehiculo();
            usuario.funcion = event.getFuncion();
        });

        apply((VehiculoAgregado event) -> {
            usuario.vehiculo = new Vehiculo( 
                event.getVehiculoId(),
                event.getMatricula());
        });

        apply((VehiculoActualizado event) -> {
            usuario.vehiculo = new Vehiculo( 
                event.getVehiculoId(),
                event.getMatricula());
        });
        

        apply((FuncionAgregada event) -> {
            usuario.funcion = new Funcion(event.getFuncionId(),
             event.getEntrada(),
              event.getDescripcion());

        });


    }
}
