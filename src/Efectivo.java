class Efectivo extends  Pago{
    public Efectivo(OrdenCompra compra) {
        super(compra);
    }
    public int calcDevolucion(){
        return 0;
    }
}
