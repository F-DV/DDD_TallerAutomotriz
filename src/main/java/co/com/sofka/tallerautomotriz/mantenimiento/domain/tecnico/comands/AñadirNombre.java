package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Nombre;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.TecnicoId;

public class AñadirNombre extends Command {

    private final TecnicoId tecnicoId;
    private final Nombre nombre;

    // Constructor
    public AñadirNombre(TecnicoId tecnicoId, Nombre nombre) {
        this.tecnicoId = tecnicoId;
        this.nombre = nombre;
    }

    // getters
    public TecnicoId getTecnicoId() {
        return tecnicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

}
