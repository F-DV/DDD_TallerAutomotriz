package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Entrada;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.FuncionId;

import java.util.Objects;

public class Funcion extends Entity<FuncionId> {

    //Declaracion de sus objetos de valor
    private Entrada entrada;
    private Descripcion descripcion;

    public Funcion(FuncionId entityId, Entrada entrada, Descripcion descripcion) {
        super(entityId);
        this.entrada = entrada;
        this.descripcion = descripcion;
    }

    //Comportamientos de la entidad Funcion
    public void agredarDescripcion(Entrada entrada){
        this.entrada = Objects.requireNonNull(entrada);
    }
    public void agregarEntrada(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    //Metodos getters
    public Entrada entrada() {
        return entrada;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
