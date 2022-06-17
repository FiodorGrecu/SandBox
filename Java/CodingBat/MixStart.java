public class MixStart {
    
public static void main(String[] args) {
    MixStart obj =new MixStart();

    boolean test = obj.mixStart("mix snacks");
    boolean test1 = obj.mixStart("nix snacks");
    boolean test2 = obj.mixStart("ni");
    System.out.println(test);
    System.out.println(test1);
    System.out.println(test2);
}

public boolean mixStart(String str){
    boolean result = false;

    if (str.startsWith("ix", 1)){
        result = true;
    }else{
        result = false;
    }
    return result;
}

}
/**
        Return true if the given string begins with "mix", 
        except the 'm' can be anything, so "pix", "9ix" .. all count.

        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false

 */