import java.util.Date;

public class Factura extends DocTributario {
    public Factura(Direccion direccion, Cliente cliente, Date fecha) {
        super(direccion, cliente, fecha);
    }

    @Override
    public String toString() {
        return "Factura:" + super.toString();
    }
}
