package my.issues.issue19;

public class Car {

    String registerNumber;
    String engineNumber;
    String model;
    String color;
    int year;

    public Car(String registerNumber, String engineNumber, String model, String color, int year) {
        this.registerNumber = registerNumber;
        this.engineNumber = engineNumber;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String toString() {
        return registerNumber + " " + engineNumber + " " + model + " " + color + " " + year;
    }
}
