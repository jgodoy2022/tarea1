class Transferencia extends Pago{
    private String banco;
    private String numCuenta;

    public Transferencia(OrdenCompra compra) {
        super(compra);
    }
}
