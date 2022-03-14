package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.events.*;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.*;

public class Usuario extends AggregateEvent<UsuarioId> {

    protected Nombre nombre;
    protected TipoUsuario tipoUsuario;
    protected Funcion funcion;
    protected Vehiculo vehiculo;


    /*
        El usuario se crea al inicio
     */
    public Usuario(UsuarioId entityId ,Nombre nombre, TipoUsuario tipoUsuario,Vehiculo vehiculo,Funcion funcion) {
        super(entityId);
        appendChange(new UsuarioCreado(nombre,tipoUsuario,vehiculo,funcion)).apply();
    }

    /*
    Comportamientos del Agregado
     */
    public void agregarFuncion(FuncionId funcionId, Descripcion descripcion,Entrada entrada ){
        appendChange(new FuncionAgregada(funcionId,descripcion, entrada )).apply();
    }
    public void actualizarEntradaDeFuncion(FuncionId funcionId, Entrada entrada){
        appendChange(new EntradaDeFuncionActualizada(funcionId,entrada)).apply();
    }
    public void actualizarDescripcionDeFuncion(FuncionId funcionId,Descripcion descripcion){
        appendChange(new DescripcionDeFuncionActualizada(funcionId,descripcion)).apply();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        appendChange(new VehiculoAgregado(vehiculo)).apply();
    }
    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }
    public void agregarMatriculaDeVehiculo(VehiculoId vehiculoId,Matricula matricula){
        appendChange(new MatriculaDeVehiculoAgregada(vehiculoId,matricula)).apply();
    }
    public void actualizarMatriculaDeVehiculo(VehiculoId vehiculoId,Matricula matricula){
        appendChange(new MatriculaDeVehiculoActualizada(vehiculoId,matricula)).apply();
    }
    public void actualizarVehiculo(Vehiculo vehiculo){
        appendChange(new VehiculoActualizado(vehiculo)).apply();
    }
    public void agregarTipoDeUsuario(TipoUsuario tipoUsuario){
        appendChange(new TipoDeUsuarioAgregado(tipoUsuario)).apply();
    }
    public void actualizarTipoDeUsuario(TipoUsuario tipoUsuario){
        appendChange(new TipoDeUsuarioActualizado(tipoUsuario)).apply();
    }
    public void actualizarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    }
    public void agregarEntradaDeFuncion(FuncionId funcionId,Entrada entrada){
        appendChange(new EntradaDeFuncionAgregada(funcionId,entrada)).apply();
    }
    public void agregarDescripcionDeFuncion(FuncionId funcionId,Descripcion descripcion){
        appendChange(new DescripcionDeFuncionAgregada(funcionId, descripcion)).apply();
    }

    /*
    Metodos getters para acceder publicamente a las variables
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
