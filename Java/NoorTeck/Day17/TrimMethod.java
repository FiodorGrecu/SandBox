public class TrimMethod {
    
    public static void main(String[] args){

        String s1 = "             I love java";
        String s2 = "I love java              ";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("***************");

        String s3 = s1.trim();
        String s4 = s2.trim();

        System.out.println(s3);
        System.out.println(s4);

        System.out.println("***************");

        String s5 = "I love            Java";
        String s6 = s5.trim();

        System.out.println(s6);

    }
}
