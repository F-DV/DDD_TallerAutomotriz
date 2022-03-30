package co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.events.DescripcionAgregada;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Descripcion;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.FacturaId;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Fecha;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.OrdenServicioId;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.RepuestoId;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Tipo;
import co.com.sofka.tallerautomotriz.mantenimiento.ordenservicio.value.Valor;

import java.util.List;

public class OrdenServicio extends AggregateEvent<OrdenServicioId> {

    //protected TecnicoId tecnicoId;
    //protected UsuarioId usuarioId;
    protected Factura factura;
    protected Mantenimiento mantenimiento;
    protected Repuesto repuesto;

    //Constructo publico
    public OrdenServicio(OrdenServicioId entityId, Factura factura, Repuesto repuesto) {
        super(entityId);
        subscribe(new OrdenServicioChange(this));
        appendChange(new OrdenCreada(entityId, factura, repuesto)).apply();

    }

    //constructor privado
    private OrdenServicio(OrdenServicioId ordenServicioId){
        super(ordenServicioId);
        subscribe(new OrdenServicioChange(this));
    }

    //constructor statico
    public static OrdenServicio from(OrdenServicioId ordenServicioId, List<DomainEvent> events){
        var ordenServicio = new OrdenServicio(ordenServicioId);
        events.forEach(ordenServicio::applyEvent);
        return ordenServicio;
    }

    //Comportamientos del agregado
    public void crearFactura(FacturaId facturaId, Fecha fecha, Valor valor){
        appendChange(new FacturaCreada(facturaId,fecha,valor)).apply();
    }
    public void crearMantenimiento(MantenimientoId mantenimientoId, Tipo tipo){
        appendChange(new MantenimientoCreado(mantenimientoId, tipo)).apply();
    }
    public void agregarRepuesto(RepuestoId repuestoId, Descripcion descripcion){
        appendChange(new RepuestoAgregado(repuestoId,descripcion)).apply();
    }

    public void crearDescripcioneDeRepuesto(RepuestoId repuestoId, Descripcion descripcion){
        appendChange(new DescripcionDeRepuestoCreada(repuestoId,descripcion)).apply();
    }

    public void crearTipoDeMantenimiento(MantenimientoId mantenimientoId, Tipo tipo){
        appendChange(new TipoDeMantenimientoCreado(mantenimientoId, tipo)).apply();
    }

    public void crearFechaDeFactura(FacturaId facturaId, Fecha fecha){
        appendChange(new FechaDeFacturaCreada(facturaId, fecha)).apply();
    }

    public void crearValorDeFactura(FacturaId facturaId, Valor valor){
        appendChange(new ValorDeFacturaCreadoi(facturaId,valor)).apply();
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
