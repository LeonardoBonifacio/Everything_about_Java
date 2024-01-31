package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        // almost the same thing than navigableSet, but here we must to pass a key,value
        // pair
        // And the object that need to be Comparable is the Key or the Comparator must
        // point only for the key
        // which means that NavigableMap sort this objects by Key and not by Value of
        // this Keys
        Customer customer = new Customer("William Suane");
        NavigableMap<Customer, Customer> map = new TreeMap<>();
        NavigableMap<String, String> map2 = new TreeMap<>();
        // as String already is Comparable the Keys in this Map will going to be sorted
        // Based on the compareTo by String Class
        map2.put("A", "Letter A");
        map2.put("D", "Letter D");
        map2.put("C", "Letter C");
        map2.put("B", "Letter B");
        map2.put("E", "Letter E");

        for (Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-----------------------");

        System.out.println(map2.headMap("C", true).remove("A"));// here i'm removing The key A before to show the headMap
        // return everything before this key, with option inclusive this key or not,
        // passing in the arguments true or false

        System.out.println(map2);

        System.out.println("------------------------");

        // Everything below is based with comparator or compareTo
        // lowerKey returs the immediate Key lower  <
        // lowerEntry returs the immediate Key and Value lower <
        // floorKey returs the immediate Key lower or equals values <=
        // floorEntry returs the immediate Key and Value lower or equals <=
        // higherKey returns the immediate Key higher value > 
        // higherEntry returns the immediate Key and Value higher > 
        // ceilingKey returns the immediate Key higher or equals >=
        // ceilingEntry returns the immediate Key and Values higher or equals >=

        System.out.println(map2.lowerKey("D"));
        System.out.println(map2.lowerEntry("D"));
        System.out.println(map2.floorKey("B"));
        System.out.println(map2.floorEntry("B"));
        System.out.println(map2.higherKey("A"));
        System.out.println(map2.higherEntry("A"));
        System.out.println(map2.ceilingKey("C"));
        System.out.println(map2.ceilingEntry("C"));




        System.out.println("---------------------------");

        // we can add one VALUE which is not comparable
        // but we cannot add one Key which is not comparable or has one comparator
        // map.put(customer, customer);

        // for (Entry<Customer, Customer> entry : map.entrySet()) {
        // System.out.println(entry.getKey() + " - " + entry.getValue());
        // }

    }
}
