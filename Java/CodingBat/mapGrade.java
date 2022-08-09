import java.util.*;

public class mapGrade {

    // 85 - 200 A
    // 75-85 - B
    // 50-75 - C
    // 40-50 - D
    // 0-40 - F
    public static void main(String[] args) {
        String[] grades = { "Prajita 85", "Aymn 80", "Gonzalo 90", "Muhammed 55", "Nasrin 200", "Yousuf 75",
                "LazyBoy 45", "ReallyLazyBoy 12" };
        System.out.println(mapGrade(grades));
    }

    public static TreeMap<String, Character> mapGrade(String[] grade) {
        TreeMap<String, Character> map = new TreeMap<>();

        for (String s : grade) {
            String[] splited = s.split(" ");
            Integer g = Integer.valueOf(splited[1]);

            if (g >= 85 && g <= 200) {
                map.put(splited[0], 'A');
            } else if (g >= 75) {
                map.put(splited[0], 'B');
            } else if (g >= 50) {
                map.put(splited[0], 'C');
            } else if (g >= 40) {
                map.put(splited[0], 'D');
            } else {
                map.put(splited[0], 'F');
            }
        }

        return map;
    }

}
