package co.com.sofka.tallerautomotriz.mantenimiento.usuario.commads;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.UsuarioId;

public class ActualizarEntradaDeFuncion extends Command {

    private final UsuarioId usuarioId;
    private final FuncionId funcionId;
    private final Entrada entrada;

    public ActualizarEntradaDeFuncion(UsuarioId usuarioId, FuncionId funcionId, Entrada entrada) {
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
