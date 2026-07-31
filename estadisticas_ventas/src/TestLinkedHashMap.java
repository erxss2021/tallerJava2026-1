import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> numbers  = new LinkedHashMap<>();
        numbers.put(3, "Tres");
        numbers.put(1, "Uno");
        numbers.put(2, "Dos");
        numbers.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

}
