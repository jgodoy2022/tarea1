import java.util.Date;

public class DocTributario {
    private final String direccion;
    private final String rut;
    private final Date fecha;
    public DocTributario(Direccion direccion, Cliente cliente, Date fecha) {
        this.direccion = direccion.getDireccion();
        this.rut = cliente.getRut();
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return "[rut: "+rut+", direccion: "+direccion+", fecha: "+fecha+"]";
    }
}

