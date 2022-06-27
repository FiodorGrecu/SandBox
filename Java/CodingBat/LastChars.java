public class LastChars {
    public static void main(String[] args) {
        
        LastChars obj = new LastChars();
        String test = obj.lastChars("last", "chars");
        String test1 = obj.lastChars("yo", "java");
        String test2 = obj.lastChars("hi", "");
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
    }

    public String lastChars(String a, String b){
        String result = "";
        String firstElementA = "";
        String lastElementB = "";

        if(a.length() > 0){
            firstElementA = a.substring(0,1);
        }else{
            firstElementA = "@";
        }
        if(b.length() > 0){
            lastElementB = b.substring(b.length()-1);
        }else{
            lastElementB = "@";
        }
        result = firstElementA + lastElementB;

        return result;
    }
    
}
/**
 

        Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
         so "yo" and "java" yields "ya".
          If either string is length 0, use '@' for its missing char.

                lastChars("last", "chars") → "ls"
                lastChars("yo", "java") → "ya"
                lastChars("hi", "") → "h@"
*/