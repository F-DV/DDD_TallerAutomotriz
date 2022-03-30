package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.FuncionId;

public class FuncionAgregada extends DomainEvent {

    private final FuncionId funcionId;
    private final Descripcion descripcion;
    private final Entrada entrada;

    public FuncionAgregada(FuncionId funcionId, Descripcion descripcion, Entrada entrada) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.usuariocreado");
        this.funcionId = funcionId;
        this.descripcion = descripcion;
        this.entrada = entrada;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Entrada getEntrada() {
        return entrada;
    }
}
