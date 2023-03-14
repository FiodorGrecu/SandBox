package abstraction;

public abstract class Cat extends Animal implements AnimalStuff{

    @Override
    public void makeNoice() {
        System.out.println("Meow");
    }
}
