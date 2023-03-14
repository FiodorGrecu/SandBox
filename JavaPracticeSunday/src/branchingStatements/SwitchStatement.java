package branchingStatements;

public class SwitchStatement {

    public static void main(String[] args) {

        String dayOfTheWeek = "sun";

        switch (dayOfTheWeek) {
            case "Mon":
                System.out.println("Today is Monday");
                break;
            case "Tues":
                System.out.println("Today is Tuesday");
                break;
            case "Wed":
                System.out.println("Today is Wednesday");
                break;
            case "Thur":
                System.out.println("Today is Thursday");
                break;
            case "Fri":
                System.out.println("Today is Friday");
                break;
            case "Sat":
                System.out.println("Today is Saturday");
                break;
            case "Sun":
                System.out.println("Today is Sunday");
            default:
                System.out.println("This day is not found");

        }

    }
}
