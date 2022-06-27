/**
 * FiobonaccForLoop
 */
public class FiobonaccForLoop {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;

        int total = 0;

        for (int i = 0; i < 5; i++) {

            total = a+b;
            System.out.println(total);

            a = b;
            b = total;
            
        }

    }
}