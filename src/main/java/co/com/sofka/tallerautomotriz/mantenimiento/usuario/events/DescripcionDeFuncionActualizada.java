package co.com.sofka.tallerautomotriz.mantenimiento.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.FuncionId;

public class DescripcionDeFuncionActualizada extends DomainEvent {

    private final FuncionId funcionId;
    private final Descripcion descripcion;

    public DescripcionDeFuncionActualizada(FuncionId funcionId, Descripcion descripcion) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.DescripcionDeFuncionActualizada");
        this.funcionId = funcionId;
        this.descripcion = descripcion;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
