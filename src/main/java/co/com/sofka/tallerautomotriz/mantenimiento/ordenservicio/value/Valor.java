package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Double> {
    private final Double value;

    public Valor(Double value){
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0){
            throw new IllegalArgumentException("Debe tener un valido");
        }

    }

    @Override
    public Double value() {
        return value;
    }

}
