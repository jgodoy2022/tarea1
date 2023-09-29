public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public void setPeso(float peso){
        this.peso = peso;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setPrecio(float precio){
        this.precio = precio;
    }

    public float getPrecio(){
        return this.precio;
    }
}
