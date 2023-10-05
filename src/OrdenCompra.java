import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra{
    private final Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detallitos;
    private DocTributario doc;
    //private float montoTotalAPagar;

    public OrdenCompra(Date fecha, Cliente cliente1, Direccion direccion1){
        detallitos=new ArrayList<>();
        doc = new DocTributario(direccion1, cliente1, fecha);
        this.fecha=fecha;
    }
    public void addOrden(DetalleOrden detalle){
        detallitos.add(detalle);
    }
    public float PrecioSinIVA(){
        float precioSinIVA = 0.0f;
        for (DetalleOrden detalle : detallitos) {
            precioSinIVA += detalle.calcPrecioSinIVA();
        }
        return precioSinIVA;
    }
    public float calcIVA(){
        float iva = 0.0f;
        for (DetalleOrden detalle : detallitos) {
            iva += detalle.calcIVA();
        }
        return iva;
    }
    public float calcPrecio(){
        float precioTotal = 0.0f;
        for (DetalleOrden detalle : detallitos) {
            precioTotal += detalle.calcPrecio();
        }
        return precioTotal;
    }
    public float calcPeso(){
        float pesoTotal = 0.0f;
        for (DetalleOrden detalle : detallitos) {
            pesoTotal += detalle.calcPeso();
        }
        return pesoTotal;
    }

    public String setEstado(String tipoEstado){
        return this.estado = tipoEstado;
    }
    public float getMontoTotalAPagar(){
        return calcPrecio();
    }

    @Override
    public String toString() {
        return "OrdenCompra: [Cantidad de artículos: "+cantidad+", peso total: "+calcPeso()+", precio sin IVA: "
                +PrecioSinIVA()+",precio con IVA: "+calcIVA()+"y el precio total: "+calcPrecio()+"]";
    }
}