public class Car  extends Vehicle{
    // instatnce Variable
    int year = 2020;

    public void display(){
            // child class
        System.out.println("Child Class Variable: " + year );

        // parent class
        System.out.println("Parent Class Variable: " + super.year);

    }
}
