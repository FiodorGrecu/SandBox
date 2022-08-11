public class MapPractice {

    public static void main(String[] args) {

        MapPractice obj = new MapPractice();

        System.out.println(obj.word0("a", "b", "a", "b"));
    }

    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {

            map.put(strings[i], 0);

        }

        return map;

    }

    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {

            map.put(strings[i], strings[i].length());

        }

        return map;

    }

}
