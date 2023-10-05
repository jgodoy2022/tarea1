import java.util.Date;
import java.util.ArrayList;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(OrdenCompra compra) {
        super(compra);
    }

    public void realizarPagos(){
        if(cuentaDePagos < monto){
            System.out.println("Usted ha realizado el pago de:"+cuentaDePagos+", para el día:"+fecha+".");
        }
        else if(cuentaDePagos == monto){
            System.out.println("Usted ha realizado el pago de:"+cuentaDePagos+", para el día:"+fecha+".");
        }
        else{
            System.out.println("Usted ha realizado el pago de:"+cuentaDePagos+", para el día:"+fecha+".");
        }
    }
    public void realizarPagosPorPlazo(float montoAPagar){
        monto -= montoAPagar;
        cuentaDePagos += montoAPagar;
    }

    public String toString(){
        return "Tarjeta: [tipo de tarjeta: "+tipo+", numero de transaccion: "+numTransaccion+"]";
    }
}
