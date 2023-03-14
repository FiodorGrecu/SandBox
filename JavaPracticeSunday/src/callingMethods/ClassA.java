package callingMethods;

public class ClassA {
     int num = 10;

    public static void main(String[] args) {

        // In order to call the Instance variable we need to create an object
        ClassA obj= new ClassA();
        int localVariable = obj.num; // --> this is the line 5 reference
        System.out.println(localVariable);

        System.out.println("***************");

        ClassA additionObject = new ClassA();
        System.out.println(additionObject.addition(1,1));

        System.out.println("***************");

        int subtractionFromAnotherClass = ClassB.subtraction(2,3);
        System.out.println(subtractionFromAnotherClass);

    }


    public int addition(int num1, int num2) {

        System.out.println(num);
        int sum = num1 + num2;
        return sum;
    }

}
