public class StudentDemo {
    
    public static void main(String[] args) {

        Student s1 = new Student();
            //  existing attributes of the parent class Person
        s1.setName("Steve");
        s1.setAge(27);
        s1.setGender('M');

        // the new ATRIBUTES
        s1.setId(777);
        s1.setMajor("CS");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());
        System.out.println(s1.getMajor());
        System.out.println(s1.getId());
        

        System.out.println("******* PERSON CLASS ****");
        Person p1 = new Person();

        p1.setName("George");
        p1.setAge(56);
        p1.setGender('M');
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        System.out.println("******* UNDERGRAD CLASS ****");

        UnderGraduate u1 = new UnderGraduate();

        u1.setName("John");
        u1.setAge(18);
        u1.setGrade(12);
        u1.setId(112);
        u1.setGender('M');
        u1.setMajor("HighSchool");

        System.out.println(u1.getName());
        System.out.println(u1.getAge());
        System.out.println(u1.getGender());
        System.out.println(u1.getGrade());
        System.out.println(u1.getId());
        System.out.println(u1.getMajor());

    }

}
