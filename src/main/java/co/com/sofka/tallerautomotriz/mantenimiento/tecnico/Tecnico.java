package co.com.sofka.tallerautomotriz.mantenimiento.tecnico;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.TecnicoId;

public class Tecnico extends AggregateEvent<TecnicoId> {

    public Tecnico(TecnicoId entityId) {
        super(entityId);
        // TODO Auto-generated constructor stub
    }

}
