import javax.print.Doc;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articulo producto1 = new Articulo(3000,"Producto1","Descripcion1",2000);
        Articulo producto2 = new Articulo(500,"Producto2","Descripcion2",40000);
        Articulo producto3 = new Articulo(1000,"Producto3","Descripcion3",2000);
        Articulo Caracoquesos = new Articulo(296,"Caracoquesos","Pasta con sabor a doritos",2000);
        Articulo producto5 = new Articulo(500,"Producto5","Descripcion5",2000);
        
        Cliente cliente1=new Cliente("Aleman tostao","21332211-2");
        Cliente cliente2=new Cliente("Adam Sandler","21309966-3");

        Direccion direccion1=new Direccion();
        direccion1.setDireccion("jaime");

        Direccion direccion2=new Direccion();
        direccion2.setDireccion("benjamin");

        Date fecha1 = new Date(123, 9, 5);
        Date fecha2 = new Date(123,9,6);
        Date fecha3 = new Date(123,10,10);

        DocTributario boleta1 = new Boleta(direccion1,cliente1,fecha1);
        DocTributario factura1 = new Factura(direccion2,cliente2,fecha2);
        DocTributario boleta2 = new Boleta(direccion2,cliente2,fecha3);
        DocTributario factura2 = new Factura(direccion1,cliente1,fecha1);

        OrdenCompra ordencompra1=new OrdenCompra(fecha1,cliente1,direccion1);
        ordencompra1.addOrden(new DetalleOrden(producto2,2));

        OrdenCompra ordencompra2 = new OrdenCompra(fecha2, cliente2, direccion2);
        ordencompra2.addOrden(new DetalleOrden(Caracoquesos, 1));
        ordencompra2.addOrden(new DetalleOrden(producto5, 4));

        OrdenCompra ordencompra3 = new OrdenCompra(fecha3, cliente1, direccion1);
        ordencompra3.addOrden(new DetalleOrden(producto3, 3));
        ordencompra3.addOrden(new DetalleOrden(producto5, 2));

        Pago pago1=new Efectivo(ordencompra1,fecha1);
        pago1.realizarPagosPorPlazo(15000);
        pago1.realizarPagos();
        System.out.println(boleta1.toString());


        Pago pago2=new Transferencia(ordencompra1,fecha2,"bancoshile","1234123514");
        pago2.realizarPagosPorPlazo(10000);
        pago2.realizarPagos();
        System.out.println(factura1.toString());

        Pago pago3=new Tarjeta(ordencompra1,fecha3,"Debito","12412341325123");
        pago3.realizarPagosPorPlazo(10000);
        pago3.realizarPagos();
        System.out.println(boleta2.toString());

        Pago pago4=new Efectivo(ordencompra1,fecha1);
        pago4.realizarPagosPorPlazo(80000);
        pago4.realizarPagos();
        System.out.println(factura2.toString());

        pago1.realizarPagosPorPlazo(15000);
        pago1.realizarPagos();
        System.out.println(boleta1.toString());
    }
}