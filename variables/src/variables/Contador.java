package variables;

public class Contador {
    public static int total = 0;
    
    public Contador(){
        total++;
    }

    public void mostrar(){
        System.out.println("Total de objetos: " + total);
    }
}
