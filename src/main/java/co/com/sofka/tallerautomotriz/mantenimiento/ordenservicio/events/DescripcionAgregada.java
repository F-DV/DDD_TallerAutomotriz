package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Descripcion;

public class DescripcionAgregada extends DomainEvent {
    private Descripcion descripcion;

    public DescripcionAgregada(Descripcion descripcion) {
        super("sofka.ordenservicio.descripcionagregada");
        this.descripcion = descripcion;

    }

    public Descripcion getDescripcion(){
        return descripcion;
    }
}
