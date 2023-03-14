package callingMethods;

public class ClassB {

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.calling());
        int subt = subtraction(15,6);
        System.out.println(subt);
    }

    public int calling() {

        ClassA obj= new ClassA();
        return obj.addition(12,3);
    }


    public static int subtraction(int n1, int n2) {

        int difference = n1 - n2;
        return difference;
    }
}
