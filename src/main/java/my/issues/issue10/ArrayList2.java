package my.issues.issue10;

import java.util.Arrays;
import java.util.List;

public class ArrayList2 {

    List<String> stateList = Arrays.asList("Perlis", "Kedah", "Kelantan", "Johor", "Perak", "Melaka");

    public static void main(String[] args) {
        ArrayList2 arrayList = new ArrayList2();

        try {
            arrayList.displayStates();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error!");
            System.out.println("The size of state is only five");
        }
    }

    public void displayStates() {

        for (int i = 0; i < stateList.size(); i++) {
            System.out.println(stateList.get(i));
        }

        if (stateList.size() > 5) {
            throw new ArrayIndexOutOfBoundsException("The size of state is five");
        }

    }
}
