public class Calculator {
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    public void add(double a, int b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        

        Calculator obj = new Calculator();

        obj.add(2,4); // will call the method with 2 params
        obj.add(2,4,6); // will call the method with 3 params
        obj.add(2.77,4,"Java"); // // will call the method with 3 params of different data-type

    }

}
