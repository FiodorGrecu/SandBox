package array;

import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        String[] friends = new String[4];
        String[] friendsArray2 = {"Natalia", "Sebastian", "Dorel", "Maria"};
        String[] friendsArray3 = {"Natalia", "Sebastian", "Dorel", "Maria"};

        for(String s: friendsArray3){
            System.out.println(s);
        }



        ArrayList<String> friendsArrayList = new ArrayList<>();


    }
}
