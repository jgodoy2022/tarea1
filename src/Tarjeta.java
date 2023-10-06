import java.util.Date;
import java.util.ArrayList;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    public Tarjeta(OrdenCompra compra,Date fecha,String tipo,String numTransaccion){
        super(compra,fecha);
        this.numTransaccion=numTransaccion;
        this.tipo=tipo;
    }

    public void realizarPagos(){
        if(cuentaDePagos < monto){
            System.out.println(OC.setEstado("Pago en proceso..."));
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
            System.out.println(OC.setEstado("Pago exitoso"));
        }
        else if(cuentaDePagos == monto){
            System.out.println(OC.setEstado("Pago en proceso..."));
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
            System.out.println(OC.setEstado("Pago exitoso"));
        }
        else{
            System.out.println(OC.setEstado("Pago en proceso..."));
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
            System.out.println(OC.setEstado("Pago exitoso"));
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
