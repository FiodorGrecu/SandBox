public class AverageDoWhileLoop {  
    public static void main(String[] args) {
        
        int i = 21;

        int sumNumber = 0;
        int average = 0;

        do {

            sumNumber += i;
            average = sumNumber / 10;

            i++;
        } while (i <= 30);

        System.out.println("Average: " + average);
    }
}
