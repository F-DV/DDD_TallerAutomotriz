package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value;

import co.com.sofka.domain.generic.Identity;

public class RepuestoId extends Identity {

    public RepuestoId() {
    }

    private RepuestoId(String id){
        super(id);
    }

    public static RepuestoId of(String id){ 
        return new RepuestoId(id);
    }
}
