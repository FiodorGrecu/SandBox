public class StarPatern {

    public static void main(String[] args) {
        System.out.println("Working");
        isDisplayed(15);
    }

    public static void isDisplayed(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
