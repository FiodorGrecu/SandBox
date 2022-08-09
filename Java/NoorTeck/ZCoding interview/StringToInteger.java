import java.lang.reflect.Type;

public class StringToInteger {

    public static void main(String[] args) {

        String s = "34";
        System.out.println(strToInt(s));
        System.out.println();

    }

    public static int strToInt(String str) {
        int result = 0;

        result = Integer.parseInt(str);

        return result;
    }

}
