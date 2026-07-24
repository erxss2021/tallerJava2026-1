import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import models.Product;

public class App {
    public static void main(String[] args){
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(7);
        numbers.add(67);
        numbers.add(17);
        numbers.add(1);
        numbers.add(17);
        numbers.add(20);
        System.out.println(numbers);
        System.out.println("Primero: " + numbers.first());
        System.out.println("Ultimo: " + numbers.last());
        System.out.println("Mayor al valor: " + numbers.higher(15));
        System.out.println("Menor al valor: " + numbers.lower(1));
        System.out.println("Ceiling: " + numbers.ceiling(67));
        System.out.println("floor: " + numbers.floor(20));
        System.out.println("TailSet: " + numbers.tailSet(98));
        System.out.println("subSet: " + numbers.subSet(1, 20));
        System.out.println("subSet: " + numbers.subSet(1, true, 20, true));
        
        Set<String> names = new TreeSet<>();
        names.add("Eloy");
        names.add("Pedro");
        names.add("Ana");
        names.add("Eloy");
        names.add("Bingo");
        names.add("Angelica");
        // System.out.println("subSet: " + names.subSet("Eloy", "Pedro"));
        System.out.println("==================================");
        System.out.println(names);

        System.out.println("============================");
        Set<Product> products = new TreeSet<>();
        // products.add(new Product(1L, "Laptop"));

    }
}
