import java.util.Date;

abstract public class Pago {
    protected float monto;
    protected Date fecha;

    public Pago(OrdenCompra compra){
        this.monto=compra.calcPrecio();
    }

    public abstract Date plazo();

}
