package abstraction;

public abstract class Animal {
  int age;
  String name;
  public abstract void makeNoice();

  public void printNAme(){
    System.out.println("My name is " + name);
  }

}
