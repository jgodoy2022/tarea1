import java.util.Date;
import java.util.ArrayList;
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra,Date fecha,String banco,String numCuenta) {
        super(compra,fecha);
        this.banco=banco;
        this.numCuenta=numCuenta;
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
        return "Transferencia: [Banco: "+banco+", numero de cuenta: "+numCuenta+"]";
    }

}
