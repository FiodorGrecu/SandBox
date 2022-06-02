public class SecondSmallestSecondLargest {
    
    public static void main(String[] args) {
        
        SecondSmallestSecondLargest obj = new SecondSmallestSecondLargest();

        int num[] = {1,2,44,99,3,6,8,11};
        obj.get2ndElement(num);

    }

    public void get2ndElement(int[] num){

        int firstSmallest = num[0];
        int firstLargest = num[0];

        for (int i= 0; i < num.length; i++){

            if (num[i] < firstSmallest){
                firstSmallest = num[i];
            }
            if (num[i] > firstLargest){
                firstLargest = num[i];
            }
        }

        int secondSmallest = num[1];
        int seconsLargest = num[1];

        for (int i= 0; i < num.length; i++){

            if(num[i] == firstSmallest || num[i] == firstLargest){
                continue;
            }
            if (num[i] < secondSmallest){
                secondSmallest = num[i];
            }
            if (num[i] > seconsLargest){
                seconsLargest = num[i];
            }

            
        }
        System.out.println("First smallest: "+firstSmallest);
        System.out.println("First largest: "+firstLargest);

        System.out.println("Second smallest: "+secondSmallest);
        System.out.println("Second largest: "+seconsLargest);

    }

}
