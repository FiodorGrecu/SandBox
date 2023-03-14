package collectionsFramework;

import java.util.LinkedHashSet;

public class DemoLinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> nameSet = new LinkedHashSet<>();

        nameSet.add("VA");
        nameSet.add("MD");
        nameSet.add("VA");
        nameSet.add("NY");
        nameSet.add("NJ");

        System.out.println(nameSet);

        nameSet.add("VA");
        nameSet.add("MD");
        System.out.println(nameSet);

        nameSet.add(null);
        nameSet.add(null);
        System.out.println(nameSet);
    }
}
