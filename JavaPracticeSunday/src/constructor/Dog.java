package constructor;

public class Dog {
    String name;
    int age;

    // default Constructor
    public Dog(){

    }

    // Parameterized Constrictor
    public Dog(String name){
        this.name = name;
    }

    // Overloaded constructor
    public Dog(int age){
        this.age = age;
    }

    // Another type of overloaded constructor
    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }
}
