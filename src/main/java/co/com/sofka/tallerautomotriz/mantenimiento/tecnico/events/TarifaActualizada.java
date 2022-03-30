package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;

public class TarifaActualizada extends DomainEvent{
    
    private final Tarifa tarifa;

    public TarifaActualizada(Tarifa tarifa){
        super("sofka.sofka.tallerautomotriz.mantenimiento.Tecnico.TarifaActualizada");
        this.tarifa = tarifa;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    
}
