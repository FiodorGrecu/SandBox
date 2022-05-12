public class Emp {
    
    // INSTANCE VARIABLES
int id;
double salary;

public static void main(String[] args) {
    
    Emp e1 = new Emp();
    Emp e2 = new Emp();
    Emp e3 = new Emp();



    e1.id = 1;
    e1.salary = 11.11;

    e2.id = 2;
    e2.salary = 22.22;

    e3.id = 3;
    e3.salary = 33.33;

    System.out.println(e1.id);
    System.out.println(e1.salary);

    System.out.println("***********");

    System.out.println(e2.id);
    System.out.println(e2.salary);

    System.out.println("***********");

    System.out.println(e3.id);
    System.out.println(e3.salary);

}

}
