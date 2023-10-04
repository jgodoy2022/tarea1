import java.util.Date;
import java.util.ArrayList;
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra) {
        super(compra);
    }

    @Override
    public void realizarPago(float montoAPagar, Date fechaDePago) {

    }

    public String toString(){
        return "Transferencia: [Banco: "+banco+", numero de cuenta: "+numCuenta+"]";
    }

}
