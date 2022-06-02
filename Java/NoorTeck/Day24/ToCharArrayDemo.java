public class ToCharArrayDemo {
    
    public static void main(String[] args) {
        String str = "JavaPrograming";

        char[] strArr = str.toCharArray();
        for(int i = 0; i <= strArr.length-1; i++){
            System.out.print(strArr[i]);
        }

    }

}
