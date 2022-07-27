import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        int[] myNumbers = { 2, 3, 5, 6, 7, 22, 88, 77 }; // declearing an array method 1
        int[] myNumbers2 = new int[10]; // declearing an array method 2

        System.out.println(myNumbers[4]);

        Person obj = new Person();

        Person obj1 = new Person("Michael", 10);

        Person obj2 = new Person("Adam", 16, "DOAHDOUHDA34U");

        // }

    }

}

class Person {

    String name;
    int age;
    String IBAN;

    Person() {

    }

    Person(String name, int age) {

        this.name = name;
        this.age = age;

    }

    Person(String name, int age, String IBAN) {
        this.name = name;
        this.age = age;
        this.IBAN = IBAN;
    }
}