public class DeleteDel {

    public static void main(String[] args) {
        
        DeleteDel obj = new DeleteDel();
        String test = obj.delDel("adelbc");
        System.out.println(test);

        // String test1 = "adelbc";
        // String newStr = test1.replaceAll("del","");
        // System.out.println(newStr);



    }

    public String delDel(String str) {
        String result =  "";
        String firstLetter = str.substring(0,1);
        // System.out.println(firstLetter);
        String restString = str.substring(4);
        // System.out.println(restString);
        
        if(str.length() >= 1){
          result = str;
        }else if (str.length() >= 4){
            if(str.contains("del")){
                result = str.replaceAll("del", "");
            }
          
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