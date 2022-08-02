import java.util.Collections;

public class Practice {

    public static void main(String[] args) {

        int[] myNumbers = { 2, 3, 5, 6, 7, 22, 88, 77 }; // declearing an array method 1

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

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
