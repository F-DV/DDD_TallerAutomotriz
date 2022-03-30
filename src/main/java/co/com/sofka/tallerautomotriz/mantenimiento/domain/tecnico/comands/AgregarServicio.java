package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.Servicio;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Estado;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.ServicioId;

public class AgregarServicio extends Command {
    
    private final ServicioId servicioId;
    private final Estado estado;


 

    public AgregarServicio(ServicioId servicioId, Estado estado) {
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
