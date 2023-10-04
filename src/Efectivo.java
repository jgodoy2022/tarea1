import java.util.Date;
class Efectivo extends Pago{
    private float pagar;
    public Efectivo(OrdenCompra compra) {
        super(compra);
    }
    public float calcDevolucion(){
        return monto - pagar;
    }


}
