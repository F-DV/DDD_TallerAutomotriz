package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;

public class AñadirTarifaDeEspecialidad extends Command{

    private final EspecialidadId especialidadId;
    private final Tarifa tarifa;

    public AñadirTarifaDeEspecialidad(EspecialidadId especialidadId, Tarifa tarifa) {
        this.especialidadId = especialidadId;
        this.tarifa = tarifa;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

}
