package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values;

import co.com.sofka.domain.generic.Identity;

public class EspecialidadId extends Identity {

    public EspecialidadId() {
    }

    public EspecialidadId(String id) {
        super(id);
    }

    // meodo para pedir el identificador sin necesidad de new
    public static EspecialidadId of(String id) {
        return new EspecialidadId(id);
    }

}
