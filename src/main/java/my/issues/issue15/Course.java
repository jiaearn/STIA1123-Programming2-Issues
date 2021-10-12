package my.issues.issue15;

import java.io.Serializable;

public class Course implements Serializable {

    private String code;
    private String name;
    private int creditHours;
    private String grade;

    public Course(String code, String name, int creditHours, String grade) {
        this.code = code;
        this.name = name;
        this.creditHours = creditHours;
        this.grade = grade;
    }

    public String toString() {
        return code + " " + name + " " + creditHours + " " + grade;
    }
}

