public class IndexOfAnArrayPosition {
    
public static void main(String[] args) {

    int[]num = {1,4,6,8};
    int n = getIndexPozition(num, 8);
    System.out.println(n);

}
    protected static int getIndexPozition(int [] num, int element){
        
        for (int i = 0; i < num.length; i++){
            if (num[i] == element){
                return i;
            }
        }

        return -1;

    }

}
