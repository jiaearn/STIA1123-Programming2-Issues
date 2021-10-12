package my.issues.issue17;

import java.util.LinkedList;
import java.util.ListIterator;

public class CarArrayList {

    public static void main(String[] args) {

        Car car1 = new Car("KCL1000", "Honda", 2000);
        Car car2 = new Car("PJY2000", "Toyota", 2011);
        Car car3 = new Car("VCN3000", "Yamaha", 2019);

        LinkedList<Car> carList = new LinkedList<>();
        carList.addFirst(car1);
        carList.addLast(car2);
        carList.addLast(car3);
        System.out.println("\nAdd list of objects");
        System.out.println(carList);

        System.out.println("\nSearch the 3rd object");
        System.out.println(carList.get(2));

        carList.remove(car2);
        System.out.println("\nRemove the 2nd object");
        System.out.println(carList);

        Car car4 = new Car("KBC9555", "Proton", 2006);
        carList.addLast(car4);
        System.out.println("\nAdd a new object");
        System.out.println(carList);

        System.out.println("\nDisplay all the object in the list");
        ListIterator<Car> mycar = carList.listIterator();
        while (mycar.hasNext()) {
            System.out.println(mycar.next() + " ");
        }
    }
}
