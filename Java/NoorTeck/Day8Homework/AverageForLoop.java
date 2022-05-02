public class AverageForLoop {
    
    public static void main(String[] args) {
        
        int sumNumbers = 0;
        int average = 0;

        for (int i = 21; i <= 30; i++ ){

            sumNumbers += i;
            average = sumNumbers / 10;
        }
        System.out.println("Average: " + average);
    }
}
