package my.issues.issue19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListOfCar implements Interface {

    static Scanner sc = new Scanner(System.in);
    List<Car> carList = new ArrayList<>();
    int count;
    String registerNumber;
    String engineNumber;
    String model;
    String color;
    int year;

    public static void main(String[] args) {
        ListOfCar lOC = new ListOfCar();
        lOC.processChoice();
    }

    public void processChoice() {
        int choice = -1;

        while (choice != 4) {
            showMainMenu();
            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();
            while (choice <= 0 || choice > 4) {
                System.out.println("Invalid selection");
                System.out.print("Please enter your choice: ");
                choice = sc.nextInt();
            }

            if (choice == 1) {
                count = input(count);
            } else if (choice == 2) {
                display(count);
            } else if (choice == 3) {
                edit();
            }
        }
        System.out.println("Thank You and Bye.");
        System.exit(0);
    }

    @Override
    public void showMainMenu() {
        System.out.println("\n~~~~~~~~~~Main Menu~~~~~~~~~~");
        System.out.println("1. Add Data");
        System.out.println("2. Display All Records");
        System.out.println("3. Edit");
        System.out.println("4. Exit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public int input(int count) {
        System.out.print("\nPlease enter 3 examples of car \n");
        for (int i = 0; i < 3; i++) {

            System.out.println("\nCar " + (count + 1));
            System.out.println("-------------");
            System.out.print("Register Number: ");
            registerNumber = sc.next() + sc.nextLine();
            System.out.print("Engine Number: ");
            engineNumber = sc.next() + sc.nextLine();
            System.out.print("Model: ");
            model = sc.next() + sc.nextLine();
            System.out.print("Color: ");
            color = sc.next() + sc.nextLine();
            System.out.print("Year: ");
            try {
                year = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Error: Please enter an integer");

            }
            count++;
            carList.add(new Car(registerNumber, engineNumber, model, color, year));

        }
        return count;
    }

    @Override
    public void display(int count) {
        int time = 0;
        if (count == 0) {
            System.out.println("\nList is empty.");
        } else {
            for (Car car : carList) {
                System.out.println("\nCar " + (time + 1));
                System.out.print("-------------");
                System.out.printf("%n%s%s", "Register Number: ", car.registerNumber);
                System.out.printf("%n%s%s", "Engine Number: ", car.engineNumber);
                System.out.printf("%n%s%s", "Model: ", car.model);
                System.out.printf("%n%s%s", "Color: ", car.color);
                System.out.printf("%n%s%s%n", "Year: ", car.year);
                time++;
            }
            System.out.println("Thank You!");
        }
    }

    @Override
    public void edit() {
        if (carList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Search for Register Number: ");
            String input = sc.next() + sc.nextLine();
            for (Car car : carList) {
                if (car.registerNumber.equalsIgnoreCase(input)) {
                    System.out.print("Register Number: ");
                    car.registerNumber = sc.next() + sc.nextLine();
                    System.out.print("Engine Number: ");
                    car.engineNumber = sc.next() + sc.nextLine();
                    System.out.print("Model: ");
                    car.model = sc.next() + sc.nextLine();
                    System.out.print("Color: ");
                    car.color = sc.next() + sc.nextLine();
                    System.out.print("Year: ");
                    try {
                        car.year = sc.nextInt();
                    } catch (InputMismatchException e) {
                        sc.next();
                        System.out.println("Error: Please enter an integer");
                    }
                }
            }
        }
    }
}
