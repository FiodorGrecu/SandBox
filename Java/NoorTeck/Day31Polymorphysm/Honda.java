public class Honda extends Car {
    
    // instance variable
    int year = 2022;

    @Override
    public void price(){
        System.out.println("$7000");
    }

    // @Override
    // public void color(){
    //     System.out.println("Black...");
    // }

    @Override
    public void upgrade(){
        System.out.println("Exhaust...");
    }
}
