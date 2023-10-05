import java.util.Date;
import java.util.ArrayList;
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra,Date fecha) {
        super(compra,fecha);
    }

    public void realizarPagos(){
        if(cuentaDePagos < monto){
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
        }
        else if(cuentaDePagos == monto){
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
        }
        else{
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".");
        }
    }
    public void realizarPagosPorPlazo(float montoAPagar){
        monto -= montoAPagar;
        cuentaDePagos += montoAPagar;
    }

    public String toString(){
        return "Transferencia: [Banco: "+banco+", numero de cuenta: "+numCuenta+"]";
    }

}
