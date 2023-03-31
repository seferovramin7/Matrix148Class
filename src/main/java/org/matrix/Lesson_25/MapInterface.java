package org.matrix.Lesson_25;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String args[]) {
        // Creating an empty HashMap
        HashMap<String, Integer> hm
                = new HashMap<String, Integer>();

        // Inserting pairs in above Map
        // using put() method
        hm.put("a", null);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put(null, 400);

        if (hm.containsKey("c")){
            System.out.println("Yes c exists");
        }
        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
