package co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Tarifa implements ValueObject<Double> {

    private final Double value;

    public Tarifa(Double value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Double value() {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * Todos los objetos deben de tener el valor equals para poderlos comprar
     */

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
        Tarifa other = (Tarifa) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
