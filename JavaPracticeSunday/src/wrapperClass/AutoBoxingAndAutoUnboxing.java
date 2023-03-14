package wrapperClass;

public class AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {
        int num = 7;

        Integer num1 = num; // autoboxing
        System.out.println(num1);

        int num2 = num1;
        System.out.println(num2); // auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);
        Integer num4 = Integer.valueOf(num3);
        System.out.println(num3 * 2);
        System.out.println(num4);


//        Also we can do it this way
        Integer obj = new Integer(100); // Creating Wrapper Class object

        // Converting the wrapper Object to primitive type
        int number = obj.intValue();
        System.out.println(number);

    }


}
