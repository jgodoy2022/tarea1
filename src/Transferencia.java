import java.util.Date;
import java.util.ArrayList;
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra) {
        super(compra);
    }

    public void realizarPago(float montoAPagar, int numeroDeCuotas, Date fechaDePago){

    }

    public String toString(){
        return "Transferencia: [Banco: "+banco+", numero de cuenta: "+numCuenta+"]";
    }

}
