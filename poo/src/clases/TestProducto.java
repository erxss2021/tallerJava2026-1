package clases;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto = new Producto();
        Producto producto2 = new Producto();
        producto.codigo = "P001";
        producto.nombre = "Balón";
        producto.precio = 500;
        producto.mostrarInformacion();
        producto.aplicarDescuento(10);
        System.out.println("---------Despues de aplicar el descuento------------");
        producto.mostrarInformacion();
        System.out.println("----------------Tenis---------------------");
        producto.codigo = "P002";
        producto.nombre = "Tenis Luka 77";
        producto.precio = 3500;
        producto.mostrarInformacion();
        producto.aplicarDescuento(10);
        System.out.println("---------Despues de aplicar el descuento------------");
        producto.mostrarInformacion();
    }
}
