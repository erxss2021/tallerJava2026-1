import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMap {
    public static void main(String[] args) {
        //getOrDefault() -> obtener un valor o uno por defecto
        //putIfAbsent()  -> insertar solo si la clave no existe
        //replace()      -> Reemplazar un valor existe
        //replaceAll()   -> Reemplazar todos los valores
        //compute()      -> Calcula un nuevo valor
        //computeIfAbsent() -> calcular solo si la clave no existe
        //computeIfPresent() -> calcular solo si la clave existe
        //merge()        -> combinar valores
        //foreach()      -> recorre el mapa con expresiones lambda
        Map<String, Integer> sales = new HashMap<>();
        sales.merge("Laptop", 1, Integer::sum);
        sales.merge("Laptop", 5, Integer::sum);
        sales.merge("Mouse", 2, Integer::sum);
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("==========================================");
        sales.forEach((p, q) -> System.out.println(p + " -> " + q));

        int keyboard = sales.getOrDefault("Mouse", 0);

        System.out.println("Keyboard -> " + sales.get("Keyboard"));
    }

}
