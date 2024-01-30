package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest01 {
    public static void main(String[] args) {
        // Map is data structe that work almost the same way that dictonary in python
        // this have one <K,V> Key = Value Structure
        Map<String, String> map = new LinkedHashMap<>();// hashMap already provide the equals and hashcode, and not keep the
                                                  // order of inserction
                                                  // LinkedHashMap keep the order of inserction
        map.put("keuboard", "keyboard");
        map.put("mousw", "mouse");
        map.put("yoi", "you");
        map.put("yoi2", "you22");// if you are passing something with the same key in our map, the "older" values
                                 // is going to be replaced by the "new" value
        // but exist one method which checks if the key is already occupied in the map
        // before add the new values in this key
        // if the key is already there the method returns the values storaged
        System.out.println();
        System.out.println(map);
        System.out.println(map.putIfAbsent("yoi", "you33"));
        System.out.println();

        // iterating over all key and get the values with get() method
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }

        System.out.println("------------------");

        // iterating over all values with the method values()
        for (String value : map.values()) {
            System.out.println(value);
        }


        System.out.println("--------------------");

        // iteration over all key and values pair with Entry interface and method entrySet from map
        for (Entry<String,String> entryKeyAndValue : map.entrySet()) {
            System.out.println(entryKeyAndValue.getKey() + " = " + entryKeyAndValue.getValue());
        }


    }
}
