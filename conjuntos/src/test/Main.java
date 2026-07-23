package test;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Eloy");
        names.add("Juan");
        names.add("Angelica");
        System.out.println(names.add("Juan"));
        System.out.println("====================================");
        names.forEach(n -> System.out.println(n));
        System.out.println("====================================");
        System.out.println(names);
        
        
    }

}
