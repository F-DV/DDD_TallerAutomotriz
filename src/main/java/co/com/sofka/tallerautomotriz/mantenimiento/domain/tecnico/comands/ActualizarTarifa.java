package co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.tecnico.values.Tarifa;

public class ActualizarTarifa extends Command {

    private final Tarifa tarifa;

    public ActualizarTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    //Metodo get
    public Tarifa getTarifa() {
        return tarifa;
    }

    
}
