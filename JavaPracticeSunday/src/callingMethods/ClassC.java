package callingMethods;

public class ClassC {

    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.method1();
        System.out.println("&&&&&&&&&&&&&&&");
        obj.method2();

    }

    public void method1() {
        System.out.println("Hello from Non-Staticc Method from the same Class");

    }


    public void method2() {
        method1();
        System.out.println("I am method 2");
    }

}
