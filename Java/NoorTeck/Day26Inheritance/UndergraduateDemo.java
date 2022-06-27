public class UndergraduateDemo {
    
    public static void main(String[] args) {
        

        UnderGraduate u1 = new UnderGraduate();

        System.out.println("******* UNDERGRAD CLASS ****");

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
