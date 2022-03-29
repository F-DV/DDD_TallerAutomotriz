package co.com.sofka.tallerautomotriz.mantenimiento.tecnico;

import java.util.Objects;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Cargo;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.EspecialidadId;
import co.com.sofka.tallerautomotriz.mantenimiento.tecnico.values.Tarifa;

public class Especialidad extends Entity<EspecialidadId> {
    // Declaracion de sus objetos de valor
    private Cargo cargo;
    private Tarifa tarifa;

    // Creamos constructor
    public Especialidad(EspecialidadId entityId, Cargo cargo, Tarifa tarifa) {
        super(entityId);
        this.cargo = cargo;
        this.tarifa = tarifa;
    }

    // Comportamientos de la entidad
    public void agregarTarifa(Tarifa tarifa) {
        this.tarifa = Objects.requireNonNull(tarifa);
    }

    public void actualizarTarifa(Tarifa tarifa) {
        this.tarifa = Objects.requireNonNull(tarifa);
    }

    public void agregarCargo(Cargo cargo) {
        this.cargo = Objects.requireNonNull(cargo);
    }

    public void actualizarCargo(Cargo cargo) {
        this.cargo = Objects.requireNonNull(cargo);
    }

    // metodos getter
    public Cargo getCargo() {
        return cargo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

}
