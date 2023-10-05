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

        OrdenCompra ordencompra1=new OrdenCompra(new Date(),cliente1,direccion1);
        ordencompra1.addOrden(new DetalleOrden(producto2,2));

        OrdenCompra ordencompra2 = new OrdenCompra(new Date(), cliente2, direccion2);
        ordencompra2.addOrden(new DetalleOrden(Caracoquesos, 1));
        ordencompra2.addOrden(new DetalleOrden(producto5, 4));

        OrdenCompra ordencompra3 = new OrdenCompra(new Date(), cliente1, direccion1);
        ordencompra3.addOrden(new DetalleOrden(producto3, 3));
        ordencompra3.addOrden(new DetalleOrden(producto5, 2));

        Pago pago1=new Efectivo(ordencompra1);
        pago1.realizarPagosPorPlazo(15000);
        pago1.realizarPagos();
    }
}