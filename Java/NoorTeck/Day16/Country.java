public class Country {
    
    // instance variables;=
    String capital;
    String language;
    int population;
    double anualSalary;

    public Country(String cap, String lang, int pop, double salary){

        capital = cap;
        language = lang;
        population = pop;
        anualSalary = salary;

    }

    public void display(){

        System.out.println("Country: " + capital);
        System.out.println("Language: " + language);
        System.out.println("Population: " + population);
        System.out.println("Salary: " + anualSalary);

    }

    public static void main(String[] args) {
        
        Country c1 = new Country("D.C.", "English", 12545, 111.111);
        Country c2 = new Country("London", "English", 5464454, 33.111);

        c1.display();
        System.out.println("**********");
        c2.display();

    }

}
