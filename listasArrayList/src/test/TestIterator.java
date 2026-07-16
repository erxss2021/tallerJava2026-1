package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        // Iterator<String> iterator = List.of("A", "B", "C").iterator();
        List<String> names = new ArrayList<>(List.of("Ana", "Luis", "Pedro"));
        Iterator<String> iterator = names.iterator();
        System.out.println(names);

        // for (String name : names) {
        //     if (name.equals("Ana")) {
        //         names.remove(name);
        //     }
        // }

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Ana")) {
                iterator.remove();
            }
        }
        System.out.println(names);
        // System.out.println(iterator.hasNext());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());
        // System.out.println(iterator.next());


    }

}
