package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico;

import java.util.List;
import java.util.Objects;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.ServicioId;

public class Servicio extends Entity<ServicioId> {

    // Inicializamos sus objetos de valor
    private Estado estado;

    // constructor
    public Servicio(ServicioId entityId, Estado estado) {
        super(entityId);
        this.estado = estado;
    }

    public void agregarEstado(Estado estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    public void actualizarEstado(Estado estado) {
        this.estado = Objects.requireNonNull(estado);
    }

    // get
    public Estado getEstado() {
        return estado;
    }

    public List<DomainEvent> getUncommittedChanges() {
        return null;
    }

}
