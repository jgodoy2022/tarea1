import java.util.Date;

class Pago {
    private float monto;
    private Date fecha;

    public Pago(OrdenCompra compra){
        this.monto=compra.calcPrecio();
    }

}
