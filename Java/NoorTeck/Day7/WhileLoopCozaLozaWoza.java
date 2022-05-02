public class WhileLoopCozaLozaWoza {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 36) {
            
            if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");

            } else if ( i % 3 == 0 ) {
                System.out.println("Coza");

            } else if ( i % 5 == 0 ) {
                System.out.println("Loza");

            } else if ( i % 7 == 0 ) {
                System.out.println("Woza");

            } else {
                System.out.println(i);
            }

            i++;

        }

    }
}
