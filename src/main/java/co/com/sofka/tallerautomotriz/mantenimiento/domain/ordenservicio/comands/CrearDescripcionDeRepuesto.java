package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.RepuestoId;

public class CrearDescripcionDeRepuesto extends Command{
    
    private final RepuestoId repuestoId;
    private final Descripcion descripcion;

    public CrearDescripcionDeRepuesto(RepuestoId repuestoId, Descripcion descripcion) {
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
