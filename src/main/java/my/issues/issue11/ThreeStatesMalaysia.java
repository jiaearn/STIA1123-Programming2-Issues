package my.issues.issue11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThreeStatesMalaysia {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        File file = new File("MyStates.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 0; i < 3; i++) {
                System.out.print("Key in the state " + (i + 1) + " : ");
                String state;
                state = sc.next() + sc.nextLine();
                fileWriter.write(state + "\n");
            }
            fileWriter.flush();
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
