package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values;

import co.com.sofka.domain.generic.ValueObject;

public class Cargo implements ValueObject<Cargo.Tipo> {

    private final Tipo value;

    public Cargo(Tipo value) {
        this.value = value;
    }

    public enum Tipo {
        MECANICO,
        ELECTRICISTA,
        CARROCERO
    }

    @Override
    public Tipo value() {
        // TODO Auto-generated method stub
        return null;
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
        Cargo other = (Cargo) obj;
        if (value != other.value)
            return false;
        return true;
    }

}
