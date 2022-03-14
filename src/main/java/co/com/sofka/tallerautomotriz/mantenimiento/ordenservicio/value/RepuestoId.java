package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value;

import co.com.sofka.domain.generic.Identity;

public class RepuestoId extends Identity {

    public RepuestoId() {
    }

    private RepuestoId(String id){
        super(id);
    }

    public static RepuestoId of(String id){ // con base a un string va a construir un identificador unico

        return new RepuestoId(id);
    }
}
