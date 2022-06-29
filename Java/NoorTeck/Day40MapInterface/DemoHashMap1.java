import java.util.HashMap;

public class DemoHashMap1 {

    public static void main(String[] args) {

        HashMap<String, String> stateMap = new HashMap<String, String>();

        // to add values we use PUT method
        stateMap.put("VA ", " Virginia");
        stateMap.put("NY ", " New York");
        stateMap.put("NJ ", " New Jersey");
        stateMap.put("TX ", " Texas");
        stateMap.put("CA ", " California");

        System.out.println(stateMap);

    }
}
