package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.UsuarioId;

public class AgregarEntradaDeFuncion extends Command {
    private final UsuarioId usuarioId;
    private final FuncionId funcionId;
    private final Entrada entrada;

    public AgregarEntradaDeFuncion(UsuarioId usuarioId, FuncionId funcionId, Entrada entrada) {
        this.usuarioId = usuarioId;
        this.funcionId = funcionId;
        this.entrada = entrada;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Entrada getEntrada() {
        return entrada;
    }
}
