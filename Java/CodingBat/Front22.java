public class Front22 {
    
public static void main(String[] args) {
    Front22 obj = new Front22();

    String s1 = obj.front22("kitten");
    String s2 = obj.front22("ki");
    String s3 = obj.front22("mama");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

}

    public String front22(String str){

        String result = "";

        if (str.length() <= 2){
        result = str.concat(str).concat(str);
        }else if (str.length() > 2){
            result = str.substring(0, 2) + str + str.substring(0,2);
        }

        return result;
    }

}
/**

        Given a string, take the first 2 chars and return the string with the 2 chars 
        added at both the front and back, so "kitten" yields"kikittenki". 
        If the string length is less than 2, use whatever chars are there.

        front22("kitten") → "kikittenki"
        front22("Ha") → "HaHaHa"
        front22("abc") → "ababcab"

 */