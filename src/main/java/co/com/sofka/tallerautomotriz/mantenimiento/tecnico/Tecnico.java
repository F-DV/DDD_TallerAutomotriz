package co.com.sofka.tallerautomotriz.mantenimiento.tecnico;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.CargoDeEspecialidadActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.CargoDeEspecialidadAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EspecialidadActualizada;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EspecialidadAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EstadoDeServicioActualizado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.EstadoDeServicioAgregado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.NombreAñadido;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.TarifaActualizada;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events.TarifaDeEspecialidadAñadido;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.ServicioId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.TecnicoId;

public class Tecnico extends AggregateEvent<TecnicoId> {

    protected Nombre nombre;
    protected EspecialidadId especialidadId;
    protected ServicioId servicioId;

    public Tecnico(TecnicoId entityId, Nombre nombre, EspecialidadId especialidadId, ServicioId servicioId) {
        super(entityId);

    }

    // comportamientos del agregado
    public void añadirNombre(TecnicoId entityId, Nombre nombre) {
        appendChange(new NombreAñadido(entityId, nombre)).apply();
    }

    public void añadirTarifaDeEspecialidad(EspecialidadId especialidadId, Tarifa tarifa) {
        appendChange(new TarifaDeEspecialidadAñadido(especialidadId, tarifa).apply();
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

    public void agregarEspecialidad(EspecialidadId especialidadId) {
        appendChange(new EspecialidadAgregada(especialidadId)).apply();
    }

    public void actualizarEspecialidad(EspecialidadId especialidadId) {
        appendChange(new EspecialidadActualizada(especialidadId)).apply();
    }

    public void agregarEstadoDeServicio(ServicioId servicioId, Estado estado) {
        appendChange(new EstadoDeServicioAgregado(servicioId, estado)).apply();
    }

    public void actualizarEstadoDeServicio(ServicioId servicioId,Estado estado) {
        appendChange(new EstadoDeServicioActualizado(servicioId, estado)).apply();
    }
}
