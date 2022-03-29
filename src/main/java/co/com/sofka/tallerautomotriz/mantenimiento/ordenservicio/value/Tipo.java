package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.TipoUsuario;

public class Tipo implements ValueObject<Tipo.Mantto> {

    private final Mantto value;

    public Tipo(Mantto value) {

        this.value = value;
    }

    @Override
    public Mantto value() {
        return value;
    }

    public enum  Mantto {
        PREVENTIVO,CORRECTIVO
    }

}
