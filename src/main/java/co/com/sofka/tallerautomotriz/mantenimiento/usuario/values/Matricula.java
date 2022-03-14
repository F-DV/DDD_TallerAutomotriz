package co.com.sofka.tallerautomotriz.mantenimiento.usuario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Matricula implements ValueObject<Matricula.Props> {

    private final String placa;
    private final String marca;
    private final String linea;
    private final String color;

    public Matricula(String placa, String marca, String linea, String color) {
        //Validaciones
        this.placa = Objects.requireNonNull(placa);
        this.marca = Objects.requireNonNull(marca);
        this.linea = Objects.requireNonNull(linea);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public Matricula.Props value() {
        return null;
    }

    public interface Props{
        String placa();
        String marca();
        String linea();
        String color();

    }
}
