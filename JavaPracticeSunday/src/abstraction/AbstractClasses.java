package abstraction;

public class AbstractClasses {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void eat() {
                System.out.println("neam neam");
            }
        };
        cat.makeNoice();
        cat.eat();
    }
}
