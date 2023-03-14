package constructor;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

public class Constructors {
    public static void main(String[] args) {

        Dog myDog = new Dog();
//        System.out.println( myDog.name); // Calling the constructor for the name
        System.out.println(myDog.name + "'s" + " age is : " + myDog.age);


//        Constants myConstants = new Constants(); // this is not going to work because the constructor is Private
        System.out.println(Constants.MY_NAME);
    }

}