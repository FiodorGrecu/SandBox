public class LengthMethod{

    public static void main(String[] args){

        String s1 = "Java";
        String s2 = "Java is all very mighty";

        System.out.println("String 1 length is: " + s1.length());
        System.out.println("String 2 length is: " + s2.length());

        String country = "United States";

        if (country.length() >15){
            System.out.println("There are too many characters in the country");
        } else if (country.length() == 10){
            System.out.println("Now that is what call country name");
        }else{
            System.out.println("Great, less typing to do");
        }
    }
}