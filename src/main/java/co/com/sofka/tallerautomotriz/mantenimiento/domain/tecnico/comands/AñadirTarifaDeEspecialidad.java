package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;

public class A├▒adirTarifaDeEspecialidad extends Command{

    private final EspecialidadId especialidadId;
    private final Tarifa tarifa;

    public A├▒adirTarifaDeEspecialidad(EspecialidadId especialidadId, Tarifa tarifa) {
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
