package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.RepuestoId;

public class DescripcionDeRepuestoCreada extends DomainEvent{

    private final RepuestoId repuestoId;
    private final Descripcion descripcion;

    public DescripcionDeRepuestoCreada(RepuestoId repuestoId, Descripcion descripcion) {
        super("sofka.sofka.tallerautomotriz.mantenimiento.ordenservicio.DescripcionDeepuestoCreada");
        this.repuestoId = repuestoId;
        this.descripcion = descripcion;
    }

    public RepuestoId getRepuestoId() {
        return repuestoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
    

    
    
}
