package my.issues.issue15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjects {

    public static void main(String[] args) throws IOException {

        Course c1 = new Course("STIA1113", "PROGRAMMING 1", 3, "A+");
        Course c2 = new Course("STQM1203", "MATHEMATICS FOR INFORMATION TECHNOLOGY", 3, "A");
        Course c3 = new Course("STIN1013", "INTRODUCTION TO ARTIFICIAL INTELLIGENCE", 3, "A");
        Course c4 = new Course("SGDN1043", "SCIENCE OF THINKING AND ETHICS", 3, "A-");
        Course c5 = new Course("VPTC1011", "HORTICULTURE I", 1, "A");
        Course c6 = new Course("SBLE2113", "ENGLISH PROFICIENCY II", 3, "B+");
        Course c7 = new Course("SADN1033", "MALAYSIAN NATIONHOOD STUDIES", 3, "B+");


        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(c1);
        courseList.add(c2);
        courseList.add(c3);
        courseList.add(c4);
        courseList.add(c5);
        courseList.add(c6);
        courseList.add(c7);

        System.out.println(courseList);

        FileOutputStream fos = new FileOutputStream("Course.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(courseList);

        System.out.println("Finish");

        oos.close();
        fos.close();
    }
}
