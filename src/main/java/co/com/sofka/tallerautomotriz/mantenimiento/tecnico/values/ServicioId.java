package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values;

import co.com.sofka.domain.generic.Identity;

public class ServicioId extends Identity {

    public ServicioId() {
    }

    public ServicioId(String uuid) {
        super(uuid);
    }

    // Metodo para pedir el identificador sin necesidad de new
    public static ServicioId of(String id) {
        return new ServicioId(id);
    }
}
