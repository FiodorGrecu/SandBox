public class EveryNth {
    
    public static void main(String[] args) {
        EveryNth obj = new EveryNth();

        String strNth = obj.everyNth("Miracle", 2);
        String strNth1 = obj.everyNth("Oracle", 3);
        System.out.println(strNth);
        System.out.println(strNth1);

    }
    public String everyNth(String str, int n){
        String result = "";
        char arr[]= str.toCharArray();

        for (int i = 0; i< arr.length; i+=2){
            result += arr[i];
        }
        return result;
        // return result.toUpperCase();
    }
    
}
/**
 *          
            Given a non-empty string and an int N, return the string made starting with char 0, 
            and then every Nth char of the string. So if N is 3, 
            use char 0, 3, 6, ... and so on. N is 1 or more.

                everyNth("Miracle", 2) → "Mrce"
                everyNth("abcdefg", 2) → "aceg"
                everyNth("abcdefg", 3) → "adg"

 * 
 */