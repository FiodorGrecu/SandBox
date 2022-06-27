public class EmployeeTwo {
    
    // Static variables
public static int id;
public static double salary;


public static void main(String[] args) {
    
    EmployeeTwo e1 = new EmployeeTwo();
    EmployeeTwo e2 = new EmployeeTwo();
    EmployeeTwo e3 = new EmployeeTwo();

        e1.id = 1;
		e1.salary = 11.11;
		
        System.out.println(e1.id);
		System.out.println(e1.salary);

		e2.id = 2;
		e2.salary = 22.22;

        System.out.println(e2.id);
		System.out.println(e2.salary);
		
		e3.id = 3;
		e3.salary = 33.33;
		
		System.out.println(e3.id);
		System.out.println(e3.salary);


}


}
