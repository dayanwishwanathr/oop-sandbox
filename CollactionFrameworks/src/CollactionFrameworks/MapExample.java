package CollactionFrameworks;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        
    	// HashMap
        
    	Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 3);
        hashMap.put("Orange", 1);
        hashMap.put("Grape", 4);

        // LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Orange", 1);
        linkedHashMap.put("Grape", 4);

        // TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 2);
        treeMap.put("Apple", 3);
        treeMap.put("Orange", 1);
        treeMap.put("Grape", 4);

        // Print each map
        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);
    
//        HashMap: {Orange=1, Apple=3, Banana=2, Grape=4}         // No specific order
//        LinkedHashMap: {Banana=2, Apple=3, Orange=1, Grape=4}   // Insertion order
//        TreeMap: {Apple=3, Banana=2, Grape=4, Orange=1}         // Sorted by key

        
    }
}
