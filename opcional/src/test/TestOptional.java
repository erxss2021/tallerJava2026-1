package test;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java");
        System.out.println(optional);
        // optional = Optional.of(null);
        // System.out.println(optional);

        String name = null;
        Optional<String> optional2 = Optional.ofNullable(name);
        System.out.println("isPresent(): " + optional2.isPresent());
        System.out.println("isEmpty(): " + optional2.isEmpty());
        // if (name != null) {
        //     System.out.println(name.length());
        // }
        // if (optional2.isPresent()) {
        //     System.out.println("get(): " + optional2.get());
        // }
        // String value = optional2.orElse("Sin información");

        System.out.println(optional2.orElse("Sin Información"));
        // System.out.println(optional2.orElseThrow());
        System.out.println(optional2.orElseThrow(
            () -> new IllegalArgumentException("No encontrado")
        ));
        
    }
}
