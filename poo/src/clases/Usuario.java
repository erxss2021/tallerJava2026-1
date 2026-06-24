package clases;

public class Usuario {
    //this  -> referencia al objeto actual
    //1. Diferenciar atributos y parametros
    //2. invocar constructores
    //3. Retornar la instancia actual
    //4. acceder a metodos del mismo objeto
    String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
    }

}
