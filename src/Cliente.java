public class Cliente {
    private String nombre;
    private String rut;
    private String direccion;
    public Cliente(Direccion villa){
        this.direccion = villa.getDireccion();
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getRut(){
        return rut;
    }
    @Override
    public String toString() {
        return null;
    }
}
