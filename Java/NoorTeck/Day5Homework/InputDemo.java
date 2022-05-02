/**
 * InputDemo
 */

import java.util.Scanner;

public class InputDemo {

    public static void main(String[] args) {
        System.out.println(" What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        switch(name){
            case "Dorel":
                System.out.println("Welcome my man!");
                break;
            case "Natalia":
                System.out.println("You are not welcome here lady ...You are Evil");
                break;
            default:
                System.out.println("try Again!");
                break;
        }
    }
}
