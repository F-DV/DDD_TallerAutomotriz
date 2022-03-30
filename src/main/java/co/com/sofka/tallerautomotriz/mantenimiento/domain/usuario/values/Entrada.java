package co.com.sofka.tallerautomotriz.mantenimiento.domain.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Entrada implements ValueObject<Entrada.Tipo> {

    private final Tipo value;

    public Entrada(Tipo value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Tipo value() {
        return null;
    }

    public enum Tipo{
        SINFALLAPRESENTE,CONLAFALLAPRESENTE
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entrada entrada = (Entrada) o;
        return value == entrada.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
