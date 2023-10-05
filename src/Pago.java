import java.util.ArrayList;
import java.util.Date;

abstract public class Pago {
    protected float monto;
    protected Date fecha;
    protected float cuentaDePagos;

    public Pago(OrdenCompra compra){
        this.monto=compra.getMontoTotalAPagar();
        cuentaDePagos = 0;
    }

    public abstract void realizarPagos();
    public abstract void realizarPagosPorPlazo(float montoAPagar);



 


}
