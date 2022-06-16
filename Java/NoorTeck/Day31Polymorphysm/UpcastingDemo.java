public class UpcastingDemo {
    
    public static void main(String[] args) {
        


        Car c1 = new Car(); // Car reference and Car Object
        Car c2 = new Honda(); // Car reference and Honda Object
                            // Parent refference pointing Child Object
        c1.price();
        c2.price();

        System.out.println(c1.year); // 2000 
        System.out.println(c2.year); // 2000 as well because value canot be overriden
        
        c1.color();
        c2.color();

        c1.upgrade();
        c2.upgrade();

    }

}
