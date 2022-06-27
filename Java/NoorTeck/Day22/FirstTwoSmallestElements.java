public class FirstTwoSmallestElements {
    
    public static void main(String[] args) {
        
        FirstTwoSmallestElements obj = new FirstTwoSmallestElements();

        int num [] = {55,3,6,88};
        obj.getTwoSmallest(num);

    }

    private void getTwoSmallest(int [] num){

        int firstSmallest = num[0];
        int secondSmallest = num[0];

        for (int i = 0; i < num.length; i ++){
            
            if(num[i] < secondSmallest){
                secondSmallest = num[i];
            }if (firstSmallest > secondSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = num[i];
            }

        }
        System.out.println("First smallest " + firstSmallest);
        System.out.println("Second smallest " + secondSmallest);
    }
}
