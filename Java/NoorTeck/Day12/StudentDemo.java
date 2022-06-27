public class StudentDemo {
    
    public static void main(String[] args) {
        // CREATING A STUDENT CLASS OBJECT

        Student student1 = new Student();
        
        student1.id = 1111;
        student1.name = "Dorel";
        student1.gender = 'M';

        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.gender);

        student1.study();
        student1.joinOnTime();
        student1.participate();

        System.out.println("*******************");

        // CREATING STUDENT 2 OBJECT    

        Student student2 = new Student();

        student2.id = 2222;
        student2.name = "Natalia";
        student2.gender = 'F';

        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.gender);

        student2.study();
        student2.joinOnTime();
        student2.participate();
        



    }

}
