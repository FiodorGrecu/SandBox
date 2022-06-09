public class StringE {

    public static void main(String[] args) {
        StringE object = new StringE();

        boolean strE = object.stringE("Hello");
        boolean strE1 = object.stringE("HHooorjh");
        System.out.println(strE);
        System.out.println(strE1);

    }

    public boolean stringE(String  str){
        
        boolean result = false;
        int countE = 0;

        for(int i=0; i<str.length();i++){
            // System.out.println(str[i]);
            if(str.charAt(i) == 'e'){
                countE++;
            }
        } 
        if(countE >=1 && countE<=3){
            return true;
        }

        return result;
    }

}

/**
 * 
 *      Return true if the given string contains between 1 and 3 'e' chars.


                stringE("Hello") → true
                stringE("Heelle") → true
                stringE("Heelele") → false
 * 
 * 
 */

