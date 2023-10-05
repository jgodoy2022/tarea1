import java.util.ArrayList;
import java.util.Date;

abstract public class Pago {
    protected float monto;
    protected Date fecha;
    protected ArrayList cuentaDePagos;

    public Pago(OrdenCompra compra){
        cuentaDePagos = new ArrayList<>();
        this.monto=compra.getMontoTotalAPagar();
    }
    public float getMonto(){
        return monto;
    }

    public abstract void realizarPago(float montoAPagar, int numeroDeCuotas, Date fechaDePago);



 


}
