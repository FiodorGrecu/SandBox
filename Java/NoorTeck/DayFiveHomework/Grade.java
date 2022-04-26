/**
 * Grade
 */
public class Grade {

    public static void main(String[] args) {

        int score = 45;
        char grade = 'A';

        if ( score >= 90 ) {
            grade = 'A';

        } else if ( score >= 80 )  {
            grade = 'B';

        } else if ( score >= 70 ) {
            grade = 'C';

        } else if ( score >= 60 ) {
            grade = 'D';
             
        } else {
            grade = 'F';
        }

        System.out.println( score );
        System.out.println( grade );
    }
}