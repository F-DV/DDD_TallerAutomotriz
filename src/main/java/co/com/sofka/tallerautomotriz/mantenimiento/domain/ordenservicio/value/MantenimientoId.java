package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value;

import co.com.sofka.domain.generic.Identity;

public class MantenimientoId extends Identity{

    public MantenimientoId() {
    }

    public MantenimientoId(String id) {
        super(id);
    }
    
     // meodo para pedir el identificador sin necesidad de new
     public static MantenimientoId of(String id) {
        return new MantenimientoId(id);
    }
}
