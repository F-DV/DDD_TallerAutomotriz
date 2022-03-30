package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import javax.smartcardio.Card;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;

public class AgregarEspecialidad extends Command{

    private final EspecialidadId especialidadId;
    private final Cargo cargo;
    private final Tarifa tarifa;

    public AgregarEspecialidad(EspecialidadId especialidadId, Cargo cargo,Tarifa tarifa) {
        this.especialidadId = especialidadId;
        this.cargo = cargo;
        this.tarifa = tarifa;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }
    

    
}
