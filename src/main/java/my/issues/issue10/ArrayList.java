package my.issues.issue10;

import java.util.Arrays;
import java.util.List;

public class ArrayList {

    List<String> stateList = Arrays.asList("Perlis", "Kedah", "Kelantan", "Johor", "Perak", "Melaka");

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
            arrayList.displayStates();
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
