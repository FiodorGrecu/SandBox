public class CodingBatEtraFront {

    public static void main(String[] args) {
        CodingBatEtraFront obj = new CodingBatEtraFront();
        String test = obj.extraFront("Hello");
        String test1 = obj.extraFront("ab");
        String test2 = obj.extraFront("H");

        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
    }

        public String extraFront(String str){
            if(str.length() < 2){
                return str.concat(str).concat(str);
            }
        String first2 = str.substring(0, 2);
        return first2.concat(first2).concat(first2);
        }
}
/**
              Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
              The string may be any length. If there are fewer than 2 chars, use whatever is there.
        
              Test cases:
                    extraFront("Hello") → "HeHeHe"
                    extraFront("ab") → "ababab"
                    extraFront("H") → "HHH"
 */