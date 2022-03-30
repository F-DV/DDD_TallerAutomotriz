package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.Mantenimiento;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.MantenimientoId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Tipo;

public class CrearMantenimiento extends Command{

    private final MantenimientoId mantenimientoId;
    private final Tipo tipo;
    
    public CrearMantenimiento(MantenimientoId mantenimientoId, Tipo tipo) {
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
