import java.util.Date;
import java.util.ArrayList;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(OrdenCompra compra) {
        super(compra);
    }

    @Override
    public void realizarPago(float montoAPagar, int numeroDeCuotas, Date fechaDePago) {

    }

    public String toString(){
        return "Tarjeta: [tipo de tarjeta: "+tipo+", numero de transaccion: "+numTransaccion+"]";
    }
    /*public void realizarPago(float montoAPagar, Date fechaDePago){
        float total = getMonto();
        if(montoAPagar < total){
            cuentaDePagos.add(montoAPagar);

        }
        else if(montoAPagar == monto){
            return 0;
        }

    }*/
}
