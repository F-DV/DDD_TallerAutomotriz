package co.com.sofka.tallerautomotriz.mantenimiento.usuario.commads;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.UsuarioId;

public class AgregarFuncion extends Command {

    private final UsuarioId usuarioId;
    private final FuncionId funcionId;

    public AgregarFuncion(UsuarioId usuarioId, FuncionId funcionId) {
        this.usuarioId = usuarioId;
        this.funcionId = funcionId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }
}
