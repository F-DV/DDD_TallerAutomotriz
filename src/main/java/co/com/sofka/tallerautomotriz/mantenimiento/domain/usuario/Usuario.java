package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events.*;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.*;

import java.util.List;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected Nombre nombre;
    protected TipoUsuario tipoUsuario;
    protected Funcion funcion;
    protected Vehiculo vehiculo;

    /*
     * El usuario se crea al inicio
     */
    public Usuario(UsuarioId entityId, Nombre nombre, TipoUsuario tipoUsuario, Vehiculo vehiculo, Funcion funcion) {
        super(entityId);
        subscribe(new UsuarioChange(this));
        appendChange(new UsuarioCreado(nombre, tipoUsuario, vehiculo, funcion)).apply();
    }

    /*
     * Para afectar los estados de esta clase propia, necesitamos un CONSTRUCTOR
     * PRIVADO (cuando voy a crear el objeto del agregado)
     * subcribe es un suscriptor que cada vez que se ejecuta un comportamiento lanza
     * un evento, este evento va a tener un subscriptor que va a estar pendiente
     * del evento para poder cambiar los estados de ESTE agregado
     */
    private Usuario(UsuarioId usuarioId) {
        super(usuarioId);
        subscribe(new UsuarioChange(this));
    }

    /*
     * Creamos un cosntructor static que nos ayuda a construir el agregado sin que
     * yo tenga que pasarle
     * todos los argumentos
     */
    public static Usuario from(UsuarioId usuarioId, List<DomainEvent> events) {
        var usuario = new Usuario(usuarioId); // constructor privado
        events.forEach(usuario::applyEvent); // Aplico los eventos a cada persona
        return usuario;
    }

    /*
     * Comportamientos del Agregado
     */
    public void agregarFuncion(FuncionId funcionId, Descripcion descripcion, Entrada entrada) {
        appendChange(new FuncionAgregada(funcionId, descripcion, entrada)).apply();
    }

    public void actualizarEntradaDeFuncion(FuncionId funcionId, Entrada entrada) {
        appendChange(new EntradaDeFuncionActualizada(funcionId, entrada)).apply();
    }

    public void actualizarDescripcionDeFuncion(FuncionId funcionId, Descripcion descripcion) {
        appendChange(new DescripcionDeFuncionActualizada(funcionId, descripcion)).apply();
    }

    public void agregarVehiculo(VehiculoId vehiculoId,Matricula matricula) {
        appendChange(new VehiculoAgregado(vehiculoId, matricula)).apply();
    }

    public void cambiarNombre(Nombre nombre) {
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void agregarMatriculaDeVehiculo(VehiculoId vehiculoId, Matricula matricula) {
        appendChange(new MatriculaDeVehiculoAgregada(vehiculoId, matricula)).apply();
    }

    public void actualizarMatriculaDeVehiculo(VehiculoId vehiculoId, Matricula matricula) {
        appendChange(new MatriculaDeVehiculoActualizada(vehiculoId, matricula)).apply();
    }

    public void actualizarVehiculo(VehiculoId vehiculoId, Matricula matricula) {
        appendChange(new VehiculoActualizado(vehiculoId, matricula)).apply();
    }

    public void agregarTipoDeUsuario(TipoUsuario tipoUsuario) {
        appendChange(new TipoDeUsuarioAgregado(tipoUsuario)).apply();
    }

    public void actualizarTipoDeUsuario(TipoUsuario tipoUsuario) {
        appendChange(new TipoDeUsuarioActualizado(tipoUsuario)).apply();
    }

    public void actualizarNombre(Nombre nombre) {
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public void agregarEntradaDeFuncion(FuncionId funcionId, Entrada entrada) {
        appendChange(new EntradaDeFuncionAgregada(funcionId, entrada)).apply();
    }

    public void agregarDescripcionDeFuncion(FuncionId funcionId, Descripcion descripcion) {
        appendChange(new DescripcionDeFuncionAgregada(funcionId, descripcion)).apply();
    }

    /*
     * Metodos getters para acceder publicamente a las variables
     */

    public Nombre nombre() {
        return nombre;
    }

    public TipoUsuario tipoUsuario() {
        return tipoUsuario;
    }

    public Funcion funcion() {
        return funcion;
    }

    public Vehiculo vehiculo() {
        return vehiculo;
    }
}
