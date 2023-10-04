import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(OrdenCompra compra) {
        super(compra);
    }

    public String toString(){
        return "Tarjeta: [tipo de tarjeta: "+tipo+", numero de transaccion: "+numTransaccion+"]";
    }
}
