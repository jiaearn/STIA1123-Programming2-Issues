package my.issues.issue14;

import java.util.ArrayList;
import java.util.List;

public class PhoneArrayList {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Nova4", "Huawei", 2018);
        Phone phone2 = new Phone("Note10", "Samsung", 2019);
        Phone phone3 = new Phone("V15", "Vivo", 2019);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);
        System.out.println("\nAdd list of objects");
        System.out.println(phoneList);

        System.out.println("\nSearch the 3rd object");
        System.out.println(phoneList.get(2));

        phoneList.remove(phone2);
        System.out.println("\nRemove the 2nd object");
        System.out.println(phoneList);


        Phone phone4 = new Phone("Iphone8", "Apple", 2017);
        phoneList.add(phone4);
        System.out.println("\nAdd a new object");
        System.out.println(phoneList);

        System.out.println("\nDisplay all the object in the list");
        for (Phone myPhone : phoneList) {
            System.out.println(myPhone);
        }
    }
}
