package condicionales;

public class Multiplos {
    public static void main(String[] args) {
        //Comprobar si un numero dado es multiplo de 3 o 5 o de ambos
        int numero = 8;
        if(numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El numero es multiplo de 3 y 5");
        }else if(numero % 3 == 0){
            System.out.println("El numero es multiplo de 3");
        }else if(numero % 5 == 0){
            System.out.println("El numero es multiplo de 5");
            
        }else{
            System.out.println("El numero no es multiplo de 3 o 5 o ambos");
            
        }
    }
}
