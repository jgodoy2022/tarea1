import java.util.ArrayList;
import java.util.Date;

abstract public class Pago {
    protected float monto;
    protected Date fecha;
    protected float cuentaDePagos;
    protected OrdenCompra OC;

    public Pago(OrdenCompra compra,Date fecha){
        this.OC = compra;
        this.fecha=fecha;
        this.monto=compra.getMontoTotalAPagar();
        cuentaDePagos = 0;
    }

   
    public abstract void realizarPagos();
    public abstract void realizarPagosPorPlazo(float montoAPagar);



 


}
