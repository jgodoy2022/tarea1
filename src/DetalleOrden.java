public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(Articulo articulo, int n) {
        this.cantidad=n;
        this.articulo=articulo;
    }
    public float calcPrecio(){
        return cantidad*articulo.getPrecio();
    }
    public float calcPrecioSinIVA(){
        return cantidad*articulo.getPrecio()*(0.89f);
    }
    public float calcIVA(){
        return calcPrecioSinIVA()*(0.19f);
    }
    public float calcPeso(){
        return cantidad* articulo.getPeso();
    }

    @Override
    public String toString() {
        return "DetalleOrden: [Cantidad de artículos: "+cantidad+", peso total: "+calcPeso()+", precio sin IVA: "
                +calcPrecioSinIVA()+",precio con IVA: "+calcIVA()+"y el precio total: "+calcPrecio()+"]";
    }
}
