import java.util.Date;

public class OrdenCompra{
    private Date fecha;
    private String estado;
    private DetalleOrden orden;

    public OrdenCompra(DetalleOrden orden,String estado,Date fecha){
        this.fecha=fecha;
        this.estado=estado;
        this.orden=orden;
    }
    public float PrecioSinIVA(){
        return orden.calcPrecioSinIVA();
    }
    public float calcIVA(){
        return orden.calcIVA();
    }
    public float calcPrecio(){
        return orden.calcPrecio();
    }
    public float calcPeso(){
        return orden.calcPeso();
    }
}