public class DeleteDel {

    public static void main(String[] args) {
        
        DeleteDel obj = new DeleteDel();
        String test = obj.delDel("adelbc");
        String test1 = obj.delDel("adel");
        System.out.println(test);
        System.out.println(test1);

    }

    public String delDel(String str) {
        String result =  "";
        if(str.length() >= 4 && str.substring(1, 4).equals("del")){
        result = str.replaceAll("del", "");
        }
        else{
          result = str;
        }
        return result;
      }  
}

/**
 *      
        Given a string, if the string "del" appears starting at index 1, 
        return a string where that "del" has been deleted. 
        Otherwise, return the string unchanged.

            delDel("adelbc") → "abc"
            delDel("adelHello") → "aHello"
            delDel("adedbc") → "adedbc"
 * 
 * 
 * 
 * 
 */