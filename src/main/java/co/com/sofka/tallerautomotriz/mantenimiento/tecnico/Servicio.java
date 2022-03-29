package co.com.sofka.tallerautomotriz.mantenimiento.tecnico;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.ServicioId;

public class Servicio extends Entity<ServicioId> {

    // Inicializamos sus objetos de valor
    private Estado estado;

    // constructor
    public Servicio(ServicioId entityId, Estado estado) {
        super(entityId);
        this.estado = estado;
    }

    public void agregarEstado() {

    }

    public void actualizarEstado() {

    }

    // get
    public Estado getEstado() {
        return estado;
    }

}
