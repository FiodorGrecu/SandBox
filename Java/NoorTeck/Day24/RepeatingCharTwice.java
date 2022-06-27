public class RepeatingCharTwice {
    
public static void main(String[] args) {
    
    String s1 = repeatChar("Mama");
    System.out.println(s1);

}

static String repeatChar(String str){
    String result = "";

    char[] stringArray = str.toCharArray();
    for (int i = 0; i < stringArray.length; i++) {

        result = result + stringArray[i]+ stringArray[i];

    }

    return result;
}

}
