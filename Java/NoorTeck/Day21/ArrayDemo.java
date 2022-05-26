public class ArrayDemo {
    
    public static void main(String[] args) {
        
        // Primitive dataType
        // If we know how much memory we need but we do not know what goes inside.
        int [] scores;
        double [] prices;
        char [] grades;
        long [] accountNumber;
        short [] ids;
        boolean [] status;
        byte [] numbers;
        float [] size;

        // Non-primitive dataType
        String [] names;

        // When we know our values we use this approach
        String [] seasons = new String [] {"Summer", "Fall", "Winter", " Spring"};
        String [] months = {"Jan", "Feb", "Mar", "Apr"};

        // Finding the length of the array we use built in function "length"
        System.out.println("Length of the seasons array is: " + seasons.length);
        System.out.println("Length of the months array is: " + months.length);

        System.out.println("______________");

        // Looking for the first element int he array
        System.out.println("First element of the array seasons is: " + seasons[0]);
        System.out.println("First element of the array months is: " + months[0]);

        // Last element of the array 
        System.out.println("Last element of the array sesasons is: " + seasons[seasons.length-1]);
        System.out.println("Last element of the array months is: " + months[months.length-1]);



    }
}