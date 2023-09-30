import java.util.Date;

public class Boleta extends DocTributario {
    public Boleta(Direccion direccion, Cliente cliente, Date fecha) {
        super(direccion, cliente, fecha);
    }

    @Override
    public String toString() {
        return "Boleta: "+super.toString();
    }
}
