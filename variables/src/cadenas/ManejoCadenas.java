package cadenas;

public class ManejoCadenas {
    public static void main(String[] args) {
        String cadena = "Hola mundo en Java 21";
        String a = "    hoLa    ", b = "hola";
        System.out.println("length() -> " + cadena.length());
        System.out.println("charAt() -> " + cadena.charAt(cadena.length() - 1));
        System.out.println("toUpperCase() -> " + cadena.toUpperCase());
        System.out.println("cadena: " + cadena);
        System.out.println("toLowerCase() -> " + cadena.toLowerCase());
        System.out.println("equals() -> " + a.equals(b));
        System.out.println("equalsIgnoreCase() -> " + a.equalsIgnoreCase(b));
        System.out.println("contains() -> " + cadena.contains("Java1"));
        System.out.println("startsWith() -> " + cadena.startsWith("Hol"));
        System.out.println("endsWith() -> " + cadena.endsWith("21"));
        System.out.println("substring(index) -> " + cadena.substring(6));
        System.out.println("substring(beginIndex, endIndex) -> " + cadena.substring(5,9));
        System.out.println("replace() -> " + cadena.replace("21", "25"));
        System.out.println("cadena: " + cadena);
        System.out.println("a: " + a+"hola");
        System.out.println("trim(): " + a.trim()+"hola");
        // System.out.println("trim(): " + a.trim()+"ola");

        System.out.println("split(): ");
        String[] arreglo = cadena.split(" ");
        for (String s : arreglo) {
            System.out.println(s);
        }






    }
}
