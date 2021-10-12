package my.issues.issue14;

public class Phone {
    private final String model;
    private final String brand;
    private final int year;

    public Phone(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }

    public String toString() {
        return model + " " + brand + " " + year;
    }
}
