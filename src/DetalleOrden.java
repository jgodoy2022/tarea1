public class DetalleOrden {
    private int cantidad;
    private float peso;
    private float precio;
    private String nombre;
    private String descripcion;
    public DetalleOrden(Articulo articulo, int n) {
        this.cantidad=n;
        this.peso= articulo.getPeso();
        this.precio= articulo.getPrecio();
    }
    public float calcPrecio(){
        return calcIVA()*cantidad;
    }
    public float calcPrecioSinIVA(){
        return cantidad*this.precio;
    }
    public float calcIVA(){
        return this.precio*(19/100);
    }
    public float calcPeso(){
        return cantidad*this.peso;
    }
}
