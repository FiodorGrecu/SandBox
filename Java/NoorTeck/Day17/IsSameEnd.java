/**
 * IsSame
 *          
 *          A problem that we need to check if the first 2 chars are the same as te last 
 *              in a given string by creating a method that does just that.
 * 
 */
public class IsSameEnd {

    public static void main(String[] args) {
        
        System.out.println(isSame("educated"));
    }
    public static boolean isSame(String str){
        boolean result = true;
    
        String end = str.substring(str.length()-2, str.length());

        if(str.substring(0, 2).contains(end)){
            result = true;
        }
        return result;
    }
    
}