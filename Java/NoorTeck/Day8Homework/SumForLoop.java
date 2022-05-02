public class SumForLoop {
    public static void main(String[] args) {
        
        int sumEven = 0;
        int sumOdd = 0;

        for ( int i = 1; i <= 20; i++){

            if (i % 2 == 0 ) {
                sumEven += i;
            } else {
                sumOdd += i;
            }

        }
        System.out.println("Sum of EVEN Numbers: " + sumEven);
		System.out.println("Sum of ODD Numbers:  " + sumOdd);

    }
}
