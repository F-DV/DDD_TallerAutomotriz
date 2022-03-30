package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Servicio;

public class AgregarServicio extends Command {
    
    private final Servicio servicio;

    public AgregarServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    
    
}