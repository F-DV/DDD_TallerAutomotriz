package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values;

import co.com.sofka.domain.generic.Identity;

public class TecnicoId extends Identity {

    public TecnicoId() {

    }

    private TecnicoId(String id) {
        super(id);
    }

    public static TecnicoId of(String id) {
        return new TecnicoId(id);
    }

}
