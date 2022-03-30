package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value;

import co.com.sofka.domain.generic.Identity;

public class OrdenServicioId extends Identity {

    public OrdenServicioId() {
    }

    public OrdenServicioId(String id) {
        super(id);
    }

    public static OrdenServicioId of(String id){ // con base a un string va a construir un identificador unico
        return new OrdenServicioId(id);
    }
    

}
