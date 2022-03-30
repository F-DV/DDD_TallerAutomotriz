package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.comands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.FuncionId;
import co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.UsuarioId;

public class AgregarEntradaDeFuncion extends Command {
    private final UsuarioId usuarioId;
    private final FuncionId funcionId;
    private final Entrada entrada;
    private final Descripcion descripcion;

    public AgregarEntradaDeFuncion(UsuarioId usuarioId, FuncionId funcionId, Entrada entrada, Descripcion descripcion) {
        this.usuarioId = usuarioId;
        this.funcionId = funcionId;
        this.entrada = entrada;
        this.descripcion = descripcion;
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

    public co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values.Descripcion getDescripcion() {
        return descripcion;
    }
    
}
