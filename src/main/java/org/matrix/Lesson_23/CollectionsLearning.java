package org.matrix.Lesson_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CollectionsLearning {
    public static void main(String[] args) {

        Customer c1 = new Customer("Ali");
        Customer c2 = new Customer("Omer");
        Customer c3 = new Customer("Ipek");
        Customer c4 = new Customer("Yusif");

        LinkedList<Customer> customers = new LinkedList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        // K, V

        // ITERABLE
        // foreach
//        for (Customer c : customers) {
//            System.out.println(c.getName());
//        }

        for (Customer c : customers) {
//            System.out.println(c.getName());
        }


        ArrayList<String> names = new ArrayList<>();
        names.add("Orxan");


        for (String name : names) {
//            System.out.println(name);
        }


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jan");
        map.put(2, "Feb");
        map.put(3, "Mar");
        map.put(4, "Apr");
        map.put(5, "May");


        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }


    }
}
