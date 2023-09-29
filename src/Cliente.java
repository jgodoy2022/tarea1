public class Cliente {
    private String nombre;
    private String rut;
<<<<<<< HEAD
    public void setNombre(String nombre) {
=======
    private String direccion;
    public Cliente(Direccion villa){
        this.direccion = villa.getDireccion();
    }
    public void setNombre(String nombre){
>>>>>>> 355603c9bce0ee5afd9c825581d733129b9f17d8
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
<<<<<<< HEAD
    public String getRut() {
        return rut;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRut() {
=======
    public String getRut(){
>>>>>>> 355603c9bce0ee5afd9c825581d733129b9f17d8
        return rut;
    }

    @Override
    public String toString() {
        return null;
    }
}
