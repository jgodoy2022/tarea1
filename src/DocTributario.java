import java.util.Date;

class DocTributario {
    private String direccion;
    private String rut;
    private Date fecha;
    public DocTributario(Direccion direccion, Cliente cliente, Date fecha) {
        this.direccion = direccion.getDireccion();
        this.rut = cliente.getRut();
        this.fecha = fecha;
    }
}

