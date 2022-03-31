package Java;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  //this is the sintax for getting an input from the user

        String scanned = sc.next();             // it gives and string from the input

        // int scanned = sc.nextInt();             // it gives and integer from the input

        // boolean scanned = sc.nextBoolean();        // it gives and Boolean from the input

        // double scanned = sc.nextDouble();        // it gives and Float from the input

        // Converting intteger into a string 
        int a = Integer.parseInt(scanned);
        
        System.out.println(a);
    }
}
