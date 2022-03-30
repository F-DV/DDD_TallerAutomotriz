package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.ServicioId;

public class EstadoDeServicioActualizado extends DomainEvent {

    private final ServicioId servicioId;
    private final Estado estado;

    public EstadoDeServicioActualizado(ServicioId servicioId, Estado estado) {

        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.EstadoDeServicioActualizado");
        this.servicioId = servicioId;
        this.estado = estado;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public Estado getEstado() {
        return estado;
    }
}
