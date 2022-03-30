package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;

public class AgregarEspecialidad extends Command{

    private final EspecialidadId especialidadId;

    public AgregarEspecialidad(EspecialidadId especialidadId) {
        this.especialidadId = especialidadId;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    
}
