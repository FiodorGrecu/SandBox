public class EndUpDemo {

    public static void main(String[] args) {
        
        EndUpDemo obj = new EndUpDemo();
        
        String test = obj.endUp("Hello"); 
        String test1 = obj.endUp("Ali");

        System.out.println(test1.charAt(0));

        System.out.println(test);
        System.out.println(test1);

    }

    public String endUp(String str){
        String result = "";

        if(str.length() <= 3){
            result = str.toUpperCase();
        }else{
            int last3 = str.length()-3;
            String beginning = str.substring(0, last3);
            String end = str.substring(last3);
            result = beginning + end.toUpperCase();
        }
        return result;
    }
}
    /**
     
        Given a string, return a new string where the last 3 chars are now in upper case. 
        If the string has less than 3 chars, uppercase whatever is there. 
        Note that str.toUpperCase() returns the uppercase version of a string.

            endUp("Hello") → "HeLLO"
            endUp("hi there") → "hi thERE"
            endUp("hi") → "HI"

        */


