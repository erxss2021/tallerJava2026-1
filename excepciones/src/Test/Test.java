package Test;

public class Test {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println(result);
        }catch (ArithmeticException e) {
            e.getStackTrace();
            System.out.println("División entre cero.");
        }
        System.out.println("Sigue el flujo normal del programa.");
        // ArithmeticException
    }
}
