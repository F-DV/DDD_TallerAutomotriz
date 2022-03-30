package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.ServicioId;

public class ActualizarEstadoDeServicio extends Command {

    private final ServicioId servicioId;
    private final Estado estado;

    public ActualizarEstadoDeServicio(ServicioId servicioId, Estado estado) {
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
