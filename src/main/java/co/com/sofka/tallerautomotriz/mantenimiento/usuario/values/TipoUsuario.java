package co.com.sofka.tallerautomotriz.mantenimiento.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoUsuario implements ValueObject<TipoUsuario.Persona> {

    private final Persona value;

    public TipoUsuario(Persona value) {
        this.value = value;
    }

    @Override
    public Persona value() {
        return null;
    }

    public enum  Persona {
        NATURAL,EMPRESA
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoUsuario that = (TipoUsuario) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
