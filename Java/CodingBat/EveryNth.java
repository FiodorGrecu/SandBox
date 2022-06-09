public class EveryNth {
    
    public static void main(String[] args) {
        EveryNth obj = new EveryNth();

        String strNth = obj.everyNth("Miracle", 2);
        System.out.println(strNth);

    }
    public String everyNth(String str, int n){
        String result = "";
        char arr[]= str.toCharArray();

        for (int i = 0; i< arr.length; i+=2){
            result += arr[i];
        }
        return result;
    }
    
}
