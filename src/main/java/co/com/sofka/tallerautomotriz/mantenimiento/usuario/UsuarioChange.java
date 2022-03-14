package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.events.FuncionAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.events.UsuarioCreado;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.events.VehiculoAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.TipoUsuario;

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
            usuario.vehiculo = event.getVehiculo();
        });
        apply((FuncionAgregada event) -> {

        });




    }
}
