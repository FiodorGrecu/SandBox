public class AverageOfSumFunction {
    public static void main(String[] args) {
        
        takeAverage(20, 30);
        takeAverage(1, 30);
        takeAverage(100, 300);

    }

    public static void takeAverage(int num1, int num2) {
        
        long sum = 0l;
        int average = 0;
        long count = 0;

        for (int i = num1+1; i < num2; i++){

            sum += i;
            count++;

        }

        average += sum / count;
        System.out.println("Average: " + average);
    }
}
