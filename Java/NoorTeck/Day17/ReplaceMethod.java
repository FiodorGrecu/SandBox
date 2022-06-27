public class ReplaceMethod {
    public static void main(String[] args) {
        System.out.println(replaceChar("Hello", 'o', ' '));
    }

    public static String replaceChar(String str, char a, char b){
        return str.replace(a,b);
    }


}
