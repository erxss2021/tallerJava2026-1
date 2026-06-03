package cadenas;

public class ManejoCadenas {
    public static void main(String[] args) {
        String cadena = "Hola mundo en Java 21";
        String a = "hoLa", b = "hola";
        System.out.println("length() -> " + cadena.length());
        System.out.println("charAt() -> " + cadena.charAt(cadena.length() - 1));
        System.out.println("toUpperCase() -> " + cadena.toUpperCase());
        System.out.println("cadena: " + cadena);
        System.out.println("toLowerCase() -> " + cadena.toLowerCase());
        System.out.println("equals() -> " + a.equals(b));
        System.out.println("equalsIgnoreCase() -> " + a.equalsIgnoreCase(b));


    }
}
