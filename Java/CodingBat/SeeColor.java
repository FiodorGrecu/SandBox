public class SeeColor {

    public static void main(String[] args) {

        SeeColor obj = new SeeColor();
        String t = obj.seeColor("redxx");
        String t1 = obj.seeColor("bluered");
        String t2 = obj.seeColor("xxred");
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t2);

    }
    
    public String seeColor(String str){
        if (str.startsWith("red")){
            return "red";
        }else if( str.startsWith("blue")){
            return "blue";
        }else{
            return "";
        }

    }

}
/**
 * 
        Given a string, if the string begins with "red" or "blue" 
        return that color string, otherwise return the empty string.

                seeColor("redxx") → "red"
                seeColor("xxred") → ""
                seeColor("blueTimes") → "blue"
 */