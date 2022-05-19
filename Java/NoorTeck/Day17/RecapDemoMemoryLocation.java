public class RecapDemoMemoryLocation {

    public static void main(String[] args) {

        int numOne = 10;
        int numTwo = 20;

        if (numOne == numTwo) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Eqaul"); // this is going to print
        }

        System.out.println("***********");

        String s1 = "John";
        String s2 = "John";

        if (s1 == s2) {
            System.out.println("Equal"); // this is going to print
        } else {
            System.out.println("Not Eqaul");
        }

        System.out.println("***************");

        String n1 = new String("Fiodor");
        String n2 = new String("Fiodor");

        if (n1 == n2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Eqaul"); // this is going to print
        }

        System.out.println("***************");

        String p1 = "Fiodor";
        String p2 = new String("Fiodor");

        if (p1 == p2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");}

    }
}
