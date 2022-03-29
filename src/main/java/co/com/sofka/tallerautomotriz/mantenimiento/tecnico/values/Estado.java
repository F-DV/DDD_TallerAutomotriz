package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estado.Tipo> {

    private final Tipo value;

    public Estado(Tipo value) {
        this.value = value;
    }

    @Override
    public Tipo value() {
        return null;
    }

    public enum Tipo {
        TERMINADO,
        NOTERMINADO
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estado other = (Estado) obj;
        if (value != other.value)
            return false;
        return true;
    }

}
