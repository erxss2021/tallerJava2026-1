package test;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        //[0, 1, 2, 3, 4, ...]
        // null <- v3 <-> v2 <-> v3 -> null
        //ListIterator
        List<String> names = new LinkedList<>();
        names.add("Eloy");
        names.add("Juan");
        System.out.println(names);
        names.forEach(System.out::println);
    }
}
