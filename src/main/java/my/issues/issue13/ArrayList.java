package my.issues.issue13;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {
    public static void main(String[] args) {

        List<String> heightsList = Arrays.asList("170", "175", "180");
        List<String> weightsList = Arrays.asList("55", "65", "70");
        List<String> agesList = Arrays.asList("21", "23", "25");

        System.out.println("\n======> using ListIterator");
        System.out.println("The list of heights(cm)");
        ListIterator<String> myListIterator = heightsList.listIterator();
        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }

        System.out.println("======> using enhanced for loop");
        System.out.println("The list of weights(kg)");
        for (String weights : weightsList) {
            System.out.println(weights);
        }

        System.out.println("======> using lambda expression");
        System.out.println("The list of ages");
        agesList.forEach(ages -> System.out.println(ages));
    }
}
