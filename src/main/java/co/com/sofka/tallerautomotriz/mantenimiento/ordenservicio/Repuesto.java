package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.RepuestoId;

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

    
    

}
