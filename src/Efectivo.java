import java.util.Date;
class Efectivo extends Pago{
    public Efectivo(OrdenCompra compra,Date fecha) {
        super(compra,fecha);
    }
    public float calcDevolucion(){
        if(monto > cuentaDePagos){
            return Math.abs(monto);
        }
        else if(monto < cuentaDePagos){
            return Math.abs(monto);
        }
        else{
            return 0;
        }
    }
    public void realizarPagos(){
        if(cuentaDePagos <= monto){
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".\n"+
                    "Usted todavía debe: "+calcDevolucion()+".");
        }
        else if(cuentaDePagos == monto){
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".\n"+
                    "Usted todavía debe: "+calcDevolucion()+".");
        }
        else{
            System.out.println("Usted ha realizado el pago de: "+cuentaDePagos+" , para el día:"+fecha+".\n"+
                    "Nosotros le debemos: "+calcDevolucion()+".");
        }
    }
    public void realizarPagosPorPlazo(float montoAPagar){
        monto -= montoAPagar;
        cuentaDePagos += montoAPagar;
    }

}
