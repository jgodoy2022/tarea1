import java.util.Date;
class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra) {
        super(compra);
    }

    public String toString(){
        return "Transferencia: [Banco: "+banco+", numero de cuenta: "+numCuenta+"]";
    }

}
