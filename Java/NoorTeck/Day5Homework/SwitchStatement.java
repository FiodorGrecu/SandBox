public class SwitchStatement {
    public static void main(String[] args) {
        String season = "spring";

        switch (season) {

            case "fall":
                System.out.println("Recovering from hot weatehr...");
                break;
            case "winter":
                System.out.println("Too Cold ...");
                break;
            case "spring":
                System.out.println("Recovering from cold....");
                break;
            case "summer":
                System.out.println("Too Hot...");
                break;
            default:
                System.out.println("Season does not exist");
        }
    }
}
