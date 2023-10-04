import java.util.Date;

public class Pago {
    protected float monto;
    protected Date fecha;

    public Pago(OrdenCompra compra){
        this.monto=compra.calcPrecio();
    }



}
