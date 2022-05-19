

public class Person {
    
    int id;
    double salary;

    public static void main(String[] args){

        Person p1 = new Person();
        p1.id = 1;
        p1.salary = 11.11;

        Person p2 = new Person();
        p2.id = 2;
        p2.salary = 22.22;

        Person p3 = new Person();
        p3.id = 3;
        p3.salary = 33.33;

        System.out.println(p1.id);
        System.out.println(p1.salary);
        System.out.println(p2.id);
        System.out.println(p2.salary);
        System.out.println(p3.id);
        System.out.println(p3.salary);

    }

}
/**


		INSTANCE VARIABLES
				--> created when an object is created and is created with "new" keyword 
				--> belongs to the OBJECTS	
				--> Each OBJECT will have a copy of it's own

*/