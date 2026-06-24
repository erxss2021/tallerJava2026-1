package condicionales;

public class Evaluacion {
    public static void main(String[] args) {
        int calificacion = 85;
        if (calificacion >= 90) {
            System.out.println("Excelente");
        }else if(calificacion >= 80){
            System.out.println("Notable");
        }else if(calificacion >= 70){
            System.out.println("Regular");
        }else{
            System.out.println("NA");

        }
    }
}
