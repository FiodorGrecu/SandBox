public class SecondLargestInArray {

    public static void main(String[] args) {

        // int arr[] = { 10, 20, 30, 15, 16, 25 };
        int arr[] = { 70, 20, 930, 185, 16, 25 };

        System.out.println(secondLargest(arr));

    }

    public static int secondLargest(int arr[]) {

        int result = 0;
        // Step 1. Check if our array is greater or equal tot2 elements
        if (arr.length >= 2) {

            // Step 2. Creating two variables that keep track of our elements of the array:

            // largest number of the array when found
            int largestNumber = arr[0]; // 10
            // second largest number
            int secondLargestNum = arr[0]; // 10

            // Step 3. Iterating through each element of the array
            for (int i = 0; i < arr.length; i++) {
                // Step 4. Comparing each element to find out if it is grater then the largest
                // 10 > 30, 20 > 30, 30 > 30, 15 > 30, 16 > 30, 25 > 30, 25 > 30...
                if (arr[i] > largestNumber) {
                    largestNumber = arr[i]; // 30 --> is the largest number
                }

            }

            // Step 5. once we fount the largest number we can look for the second largest
            // So we will iterate the second time through the array and compare each elem to
            // the largest
            for (int j = 0; j < arr.length; j++) {
                // Step 6. We will chech if the second largest is not equal to largest
                // if not equal then it will go throught the loop and compare each elem to
                // largest
                // 10 == 30, 20 == 30, 30 == 30, 15 == 30, 16 == 30, 25 == 30, 25 == 30..
                if (arr[j] != largestNumber) {
                    // compare elements vs second largest and if it is grater will assign the val to
                    // it
                    if (arr[j] > secondLargestNum) {
                        secondLargestNum = arr[j]; // 25
                        result = secondLargestNum;
                    }
                }
            }
        } else {
            System.out.println("Please provide array of length 2 or more");
        }

        return result;
    }
}
