package co.com.sofka.tallerautomotriz.mantenimiento.usuario.commads;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.UsuarioId;

public class ActualizarDescripcionDeFuncion extends Command {

    private final UsuarioId usuarioId;
    private final FuncionId funcionId;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeFuncion(UsuarioId usuarioId, FuncionId funcionId, Descripcion descripcion) {
        this.usuarioId = usuarioId;
        this.funcionId = funcionId;
        this.descripcion = descripcion;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public FuncionId getFuncionId() {
        return funcionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
