package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Fecha;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Valor;

public class Factura extends Entity<FacturaId> {
    private Valor valor;
    private Fecha fecha;

    public Factura(FacturaId entityId, Valor valor, Fecha fecha) {
        super(entityId);
        this.valor = valor;
        this.fecha = fecha;
    }

    //Comportamientos

    public void agregarPrecio(Valor valor){
        this.valor = valor;
    }

    public void agregarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    //Propiedades
    public Valor valor(){
        return valor;
    }

    public Fecha fecha(){
        return fecha;
    }
}
