public class WithoutEnd2 {

    public static void main(String[] args) {
         
        WithoutEnd2 obj = new WithoutEnd2();
        String test = obj.withoutEnd2("Hello");
        System.out.println(test);
    }
    
    public String withoutEnd2(String str){
        if (str.length() <= 2){
            return "";
        }
        return str.substring(1,str.length() - 1);
    }

}
/** 
 * 
                Given a string, return a version without both the first and last char of the string.
                The string may be any length, including 0.

                Test cases:
                        withouEnd2("Hello") → "ell"
                        withouEnd2("abc") → "b"
                        withouEnd2("ab") → ""
        */