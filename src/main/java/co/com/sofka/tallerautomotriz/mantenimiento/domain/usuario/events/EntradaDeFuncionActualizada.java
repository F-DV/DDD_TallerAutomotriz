package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.FuncionId;

public class EntradaDeFuncionActualizada extends DomainEvent {

    private final FuncionId funcionId;
    private final Entrada entrada;

    public EntradaDeFuncionActualizada(FuncionId funcionId, Entrada entrada) {
        super("sofka.tallerautomotriz.mantenimiento.usuario.EntradaDeFuncionActualizada");
        this.funcionId = funcionId;
        this.entrada = entrada;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Entrada getEntrada() {
        return entrada;
    }
}
