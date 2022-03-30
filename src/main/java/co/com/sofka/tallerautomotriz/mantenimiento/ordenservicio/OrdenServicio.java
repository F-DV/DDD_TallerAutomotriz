package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.events.DescripcionAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.OrdenServicioId;

import java.util.List;

public class OrdenServicio extends AggregateEvent<OrdenServicioId> {

    //protected TecnicoId tecnicoId;
    //protected UsuarioId usuarioId;
    protected Factura factura;
    protected Mantenimiento mantenimiento;
    protected Repuesto repuesto;


    public OrdenServicio(OrdenServicioId entityId, Factura factura, Repuesto repuesto) {
        super(entityId);
        appendChange(new OrdenCreada(entityId, factura, repuesto)).apply();

    }
/*
    public static OrdenServicio from(OrdenServicioId ordenId, List<DomainEvent> events){
        var ordenServicio = new OrdenServicio(OrdenServicioId);
        events.forEach(ordenServicio::applyEvent);
        return ordenServicio;
    }
*/
    public void agregarDescripcionRespuesto(Descripcion descripcion){
        appendChange(new DescripcionAgregada(descripcion)).apply();
    }



    //Getters
    public Factura getFactura() {
        return factura;
    }

    public Mantenimiento Mantenimiento() {
        return mantenimiento;
    }

    public Repuesto Repuesto() {
        return repuesto;
    }
 



}
