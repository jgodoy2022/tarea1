import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra{
    private final Date fecha;
    private String estado;
    private DetalleOrden orden;
    private ArrayList<DetalleOrden> m;
    private DocTributario doc;
    //private float montoTotalAPagar;

    public OrdenCompra(DetalleOrden orden,Date fecha, Cliente cliente1, Direccion direccion1){
        m=new ArrayList<>();
        doc = new DocTributario(direccion1, cliente1, fecha);
        this.fecha=fecha;
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

    public String setEstado(String tipoEstado){
        return this.estado = tipoEstado;
    }
    public float getMontoTotalAPagar(){
        return ;
    }

    @Override
    public String toString() {
        return null;
    }
}