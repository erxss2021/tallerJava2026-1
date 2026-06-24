package ciclos;

public class TablasMultiplicar {
    public static void main(String[] args) {
        for(int tabla = 1; tabla <= 10; tabla++){
            System.out.println("\nTabla del " + tabla);
            for(int mult = 1; mult <= 10; mult++){
                System.out.printf("%d x %d = %d%n", tabla, mult, tabla * mult);
            }
        }
    }
}
