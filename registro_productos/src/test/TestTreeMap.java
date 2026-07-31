package test;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> maps = new TreeMap<>();
        maps.put(40, "D");
        maps.put(10, "F");
        maps.put(50, "E");
        maps.put(30, "C");
        maps.put(20, "B");
        maps.forEach((k, v) -> System.out.println(k + " -> " + v));

        //firstKey -> obtiene la menor clave
        System.out.println("Menor clave: " + maps.firstKey());
        
        //lastKey -> obtiene la mayor clave
        System.out.println("Mayor clave: " + maps.lastKey());
        
        
        //higherKey -> obtiene la siguiente clave extrictamente mayor
        System.out.println("Mayor clave 40: " + maps.higherKey(40));
        
        //lowerKey --> obtiene la clave inmediatamente menor
        System.out.println("Menor clave 40: " + maps.lowerKey(5));
        
        //ceilingKey -> se obtiene la misma clave si existe, la siguiente mayor
        System.out.println("Menor clave 40: " + maps.ceilingKey(40));
        
        //floorKey -> se obtiene la misma clave si existe, la siguiente menor
        System.out.println("Menor clave 15: " + maps.floorKey(15));

        //headMap -> obtiene todos los elementos anteriores a la clave
        System.out.println("Menores: " + maps.headMap(30));
        System.out.println("Menores: " + maps.headMap(30, true));

        //tailMap -> obtiene todos los elementos iguales o posteriores
        System.out.println("Iguales o posteriores: " + maps.tailMap(30));
        System.out.println("Iguales o posteriores: " + maps.tailMap(30, false));

        //subMap -> obtiene un rango
        System.out.println("Rango: " + maps.subMap(20, 40));
        System.out.println("Rango: " + maps.subMap(20, false, 40, true));
        

    }

}
