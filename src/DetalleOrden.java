public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(Articulo articulo, int n) {
        this.cantidad=n;
        this.articulo=articulo;
    }
    public float calcPrecio(){
        return calcIVA()+calcPrecioSinIVA();
    }
    public float calcPrecioSinIVA(){
        return cantidad*articulo.getPrecio();
    }
    public float calcIVA(){
        return calcPrecioSinIVA()*(19/100);
    }
    public float calcPeso(){
        return cantidad* articulo.getPeso();
    }
}
