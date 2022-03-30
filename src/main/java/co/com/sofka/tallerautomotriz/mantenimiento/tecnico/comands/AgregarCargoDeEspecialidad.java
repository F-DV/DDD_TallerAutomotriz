package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;

public class AgregarCargoDeEspecialidad extends Command{
    
    private final EspecialidadId especialidadId;
    private final Cargo cargo;

    
    public AgregarCargoDeEspecialidad(EspecialidadId especialidadId, Cargo cargo) {
        this.especialidadId = especialidadId;
        this.cargo = cargo;
    }


    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }


    public Cargo getCargo() {
        return cargo;
    }
}
