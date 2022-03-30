package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Funcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.Vehiculo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.TipoUsuario;

public class UsuarioCreado extends DomainEvent {

    private final Nombre nombre;
    private final TipoUsuario tipoUsuario;
    private final Vehiculo vehiculo;
    private final Funcion funcion;

    /*
       tipeamos el evento de dominio y el parametro es una propiedad que va a ser transportada
       de un lugar a otro.
       Esto es un POJO osea un objeto plano que puede tener los gets, no es una Entidad, es simplemente para
       transportar objetos como un DTO
    */

    public UsuarioCreado(Nombre nombre, TipoUsuario tipoUsuario, Vehiculo vehiculo, Funcion funcion) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.usuariocreado");
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.vehiculo = vehiculo;
        this.funcion = funcion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Funcion getFuncion() {
        return funcion;
    }
}
