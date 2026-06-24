package clases;

public class Producto {

    //Atributos
    String codigo;
    String nombre;
    double precio;

    //metodos --> tipoDeRetorno nombreMetodo(tipoDato nombreParametro, ...)
    void aplicarDescuento(double porcentaje){
        precio -= precio * porcentaje / 100;
    }

    void mostrarInformacion(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
    }

}
