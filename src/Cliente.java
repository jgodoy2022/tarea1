public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;

    public Cliente(String nombre,String rut){
        this.nombre = nombre;
        this.rut=rut;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return rut;
    }
    public String obtenerDireccion(){
       return direccion.getDireccion();
    }

    @Override
    public String toString() {
        return "Cliente: [nombre: "+nombre+", rut: "+rut+", dirección: "+obtenerDireccion()+"]";
    }
}
