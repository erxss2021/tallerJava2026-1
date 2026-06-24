package ciclos;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        //Mostrar un triangulo descendente de asteriscos con un nivel de 5, disminuyendo hasta 1
        // *****
        // ****
        // ***
        // **
        // *

        for(int fila = 5; fila > 0; fila--){
            for(int columna = 1; columna <= fila; columna++){
                System.out.print("*");
            }
            System.out.println();
        }
        // System.out.println(Math.abs(-5));
        
    }

}
