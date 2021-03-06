package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;

public class ActualizarEspecialidad extends Command {

    private final EspecialidadId especialidadId;

    public ActualizarEspecialidad(EspecialidadId especialidadId) {
        this.especialidadId = especialidadId;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    
}
