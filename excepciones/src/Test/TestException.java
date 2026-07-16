package Test;

public class TestException {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.equals("name"));
        } catch (NullPointerException e) {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
            System.out.println("Error de código");
        }

        try {
            System.out.println(name.length());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Otra exception");
        }
        System.out.println("Sigue el flujo normal.");
    }

}
