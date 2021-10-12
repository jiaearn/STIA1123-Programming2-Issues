package my.issues.issue18;

import java.util.Enumeration;
import java.util.Vector;

public class HelloArrayList {

    public static void main(String[] args) {

        Vector<Object> anyList = new Vector<>();

        anyList.add(123);
        anyList.add("Java");
        anyList.add(20.8);
        anyList.add('A');
        System.out.println("\nAdd list of objects");
        System.out.println(anyList);

        System.out.println("\nSearch the 3rd object");
        System.out.println(anyList.get(2));

        anyList.remove(1);
        System.out.println("\nRemove the 2nd object");
        System.out.println(anyList);

        anyList.add("Python");
        System.out.println("\nAdd a new object");
        System.out.println(anyList);

        Enumeration<Object> e = anyList.elements();
        System.out.println("\nDisplay all the object in the list");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

}
