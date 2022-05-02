import java.util.jar.Manifest;

/**
 * IfElseExercise
 */
public class IfElseExercise {

    public static void main(String[] args) {
        

        int a = 10;
        int b = 44;
        int tot = a+b;

        if (tot <= 13 && tot <= 19){
            tot = 19;

        }else{
            tot = a+b;
        }
        System.out.println("Sum of two numbers: " + tot);
    }

}