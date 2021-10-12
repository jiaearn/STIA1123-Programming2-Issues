package my.issues.issue12;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) {

        char[] states = new char[30];
        int size;

        File file = new File("MyStates.txt");
        try {
            FileReader fileReader = new FileReader(file);
            size = fileReader.read(states);
            System.out.println("\nSize = " + size + "\n");
            for (char s : states) {
                System.out.print(s);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
