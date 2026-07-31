import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        //clave -> valor
        String name = "Java";
        System.out.println(name.hashCode());

        //hash, key, value, next
        //Node<K, V>

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Eloy");
        names.put(2, "Angelica");
        names.put(3, "Pedro");
        names.put(4, "Ana");

        System.out.println(names);
        names.put(10, "Juan");
        System.out.println(names);
        System.out.println(names.get(6));
        System.out.println(names.remove(2));
        System.out.println(names);
        System.out.println(names.containsKey(1));
        System.out.println(names.containsValue("Pedro"));

    }
}
