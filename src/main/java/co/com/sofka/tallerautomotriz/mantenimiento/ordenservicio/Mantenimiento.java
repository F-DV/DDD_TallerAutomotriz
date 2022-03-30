package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.MantenimientoId;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Tipo;

public class Mantenimiento extends Entity<MantenimientoId>{

    private Tipo tipo;

    public Mantenimiento(MantenimientoId entityId, Tipo tipo) {
        super(entityId);
        //TODO Auto-generated constructor stub
        this.tipo = tipo;
    }

    //comportamientos de la entidad mantenimiento
    public void agregarTipo(Tipo tipo){
        this.tipo = Objects.requireNonNull(tipo);
    }

    //agregamos getter
    
    public Tipo getTipo() {
        return tipo;
    }

   
    
    
}
