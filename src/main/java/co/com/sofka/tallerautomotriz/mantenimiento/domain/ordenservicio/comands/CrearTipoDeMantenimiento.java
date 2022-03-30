package co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.comands;

import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.MantenimientoId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Tipo;

public class CrearTipoDeMantenimiento {

    private final MantenimientoId mantenimientoId;
    private final Tipo tipo;

    public CrearTipoDeMantenimiento(MantenimientoId mantenimientoId, Tipo tipo) {
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
