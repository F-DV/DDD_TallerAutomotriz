package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.MantenimientoId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Tipo;

public class TipoDeMantenimientoCreado extends DomainEvent {
    
    private final MantenimientoId mantenimientoId;
    private final Tipo tipo;


    public TipoDeMantenimientoCreado(MantenimientoId mantenimientoId, Tipo tipo) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.TipoDeMantenimientoCreado");
        this.mantenimientoId = mantenimientoId;
        this.tipo = tipo;
    }

    public MantenimientoId getMantenimientoId() {
        return mantenimientoId;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
}
