public class Practice {
    public static void main(String[] args) {

        int [] nums = {1,2,4,6};
        int count = 0;
        for (var n : nums) {
            if(n%2 == 0){
                count++;  
            }
            
        }
        System.out.println(count);
    }
   
    
}
