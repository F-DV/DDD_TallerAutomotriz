package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.RepuestoId;

import java.util.List;
import java.util.Objects;

public class Repuesto extends Entity<RepuestoId> {

    private Descripcion descripcion;

    public Repuesto(RepuestoId entityId, Descripcion descripcion){
        super(entityId);
        this.descripcion = descripcion;
    }

    public Repuesto(RepuestoId entityId) {
        super(entityId);
    }

    //comportamientos

    public void agregarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    //getter
    public Descripcion getDescripcion() {
        return descripcion;
    }

    public List<DomainEvent> getUncommittedChanges() {
        return null;
    }

    
    

}
