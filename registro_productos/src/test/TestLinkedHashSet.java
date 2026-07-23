package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Eloy");
        names.add("Bingo");
        names.add("Angelica");
        names.add("Bingo");
        System.out.println(names);
    }
}
