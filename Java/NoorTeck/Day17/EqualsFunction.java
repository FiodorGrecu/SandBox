public class EqualsFunction {

    public static void main(String[] args){

        String s1 = "John";
        String s2 = "John";

        /**
         * 
         * RETURN TYPE: boolean 
         * PARAMETER : 1 String
         * PURPOSE : compares the 2 string values/content
         * 
         */

        if (s1.equals(s2)){
            System.out.println("Equal"); //  this will print
        }else{
            System.out.println("Not Equal");
        }

        System.out.println("****************");

        String s3 = new String("John");
        String s4 = new String("John");

        if (s3.equals(s4)){
            System.out.println("Equal"); //  this will print
        }else{
            System.out.println("Not Equal");
        }

    }

}
