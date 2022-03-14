package co.com.sofka.tallerautomotriz.mantenimiento.usuario;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.Matricula;
import co.com.sofka.tallerautomotriz.mantenimiento.usuario.values.VehiculoId;

import java.util.Objects;

public class Vehiculo extends Entity<VehiculoId> {

    private Matricula matricula;

    public Vehiculo(VehiculoId entityId, Matricula matricula) {
        super(entityId);
        this.matricula = matricula;
    }

    //Comportamientos de la funcion
    public void agregarMatricula(Matricula matricula){
        this.matricula = Objects.requireNonNull(matricula);
    }
    public void actualizarMatricula(Matricula matricula){
        this.matricula = Objects.requireNonNull(matricula);
    }

    //Metodo getter

    public Matricula matricula() {
        return matricula;
    }
}
