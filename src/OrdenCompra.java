import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra{
    private final Date fecha;
    private String estado;
    private DetalleOrden orden;
    private ArrayList<DetalleOrden> m;
    private DocTributario doc;
    private Cliente cliente1;
    private Direccion direccion1;

    public OrdenCompra(DetalleOrden orden,String estado,Date fecha){
        m=new ArrayList<>();
        this.fecha=fecha;
        this.estado=estado;
        this.orden=orden;
    }
    public void addOrden(DetalleOrden orden){
        m.add(orden);
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
    public String getNombre(){
        return 
    }

    @Override
    public String toString() {
        return null;
    }
}