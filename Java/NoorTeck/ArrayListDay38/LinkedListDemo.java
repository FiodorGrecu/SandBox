import java.util.LinkedList;
public class LinkedListDemo {
    
    public static void main(String[] args) {
     
        LinkedList<String> names = new LinkedList<String>();

        names.add("James");
		names.add("Chris");
		names.add("Mechelle");
		names.add("Fiodor");
		names.add("Fahim");

        System.out.println(names);
		
        // adding at first position
        names.addFirst("Fahim");
        System.out.println("*********************");
        System.out.println(names);


        // adding at last position
        names.addLast("Dorel");
        System.out.println("*********************");
        System.out.println(names);
        System.out.println(names.size());
    }
}
