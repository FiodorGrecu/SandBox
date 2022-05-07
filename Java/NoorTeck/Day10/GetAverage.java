public class GetAverage {
    

    public static void main(String[] args) {
        
        int student1 = getAverage(78, 88, 87);
        int student2 = getAverage(73, 78, 87);

        System.out.println("Student 1 average is : "+student1);
        System.out.println("Student 2 average is : "+student2);
    }


    public static int getAverage(int examOne, int examTwo, int examThree){
        int result = 0;

        result = (examOne + examTwo + examThree)/ 3;

        return result;
    }
}
