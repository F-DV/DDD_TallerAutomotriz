package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico;

import java.util.List;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.CargoDeEspecialidadActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.CargoDeEspecialidadAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.EspecialidadActualizada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.EspecialidadAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.EstadoDeServicioActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.EstadoDeServicioAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.NombreAñadido;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.ServicioActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.ServicioAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.TarifaActualizada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.TarifaDeEspecialidadAñadido;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events.TecnicoCreado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.ServicioId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.TecnicoId;

public class Tecnico extends AggregateEvent<TecnicoId> {

    protected Nombre nombre;
    protected Especialidad especialidad;
    protected Servicio servicio;

    //constructor publico
    public Tecnico(TecnicoId entityId, Nombre nombre, Especialidad especialidad, Servicio servicio) {
        super(entityId);
        subscribe(new TecnicoChange(this));
        appendChange(new TecnicoCreado(nombre, especialidad, servicio)).apply();

    }

    //constructor privado
    private Tecnico(TecnicoId tecnicoId){
        super(tecnicoId);
        subscribe(new TecnicoChange(this));

    }


    //Constructor static
    public static Tecnico from(TecnicoId tecnicoId, List<DomainEvent> events) {
        var tecnico = new Tecnico(tecnicoId); // constructor privado
        events.forEach(tecnico::applyEvent); // Aplico los eventos a cada persona
        return tecnico;
    }

    
    // comportamientos del agregado
    public void añadirNombre(TecnicoId entityId, Nombre nombre) {
        appendChange(new NombreAñadido(entityId, nombre)).apply();
    }

    public void añadirTarifaDeEspecialidad(EspecialidadId especialidadId, Tarifa tarifa, Cargo cargo) {
        appendChange(new TarifaDeEspecialidadAñadido(especialidadId, tarifa, cargo)).apply();
    }

    public void actualizarTarifa(Tarifa tarifa) {
        appendChange(new TarifaActualizada(tarifa)).apply();
    }

    public void actualizarCargoDeEspecialidad(EspecialidadId especialidadId, Cargo cargo) {
        appendChange(new CargoDeEspecialidadActualizado(especialidadId, cargo)).apply();
    }

    public void agregarCargoDeEspecialidad(EspecialidadId especialidadId, Cargo cargo) {
        appendChange(new CargoDeEspecialidadAgregado(especialidadId, cargo)).apply();
    }

    public void agregarEspecialidad(EspecialidadId especialidadId, Tarifa tarifa, Cargo cargo) {
        appendChange(new EspecialidadAgregada(especialidadId,cargo,tarifa)).apply();
    }

    public void actualizarEspecialidad(EspecialidadId especialidadId, Tarifa tarifa, Cargo cargo) {
        appendChange(new EspecialidadActualizada(especialidadId,cargo,tarifa)).apply();
    }

    public void agregarEstadoDeServicio(ServicioId servicioId, Estado estado) {
        appendChange(new EstadoDeServicioAgregado(servicioId, estado)).apply();
    }

    public void actualizarEstadoDeServicio(ServicioId servicioId,Estado estado) {
        appendChange(new EstadoDeServicioActualizado(servicioId, estado)).apply();
    }

    public void agregarServicio(ServicioId servicioid, Estado estado){
        appendChange(new ServicioAgregado(servicioid,estado)).apply();
    }
    public void actualizarServicio(ServicioId servicioid, Estado estado){
        appendChange(new ServicioActualizado(servicioid,estado)).apply();
    }

    // Getters para acceder publicamente
    public Nombre Nombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public Servicio getServicio() {
        return servicio;
    }


    


    
}
