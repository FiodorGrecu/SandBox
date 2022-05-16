public class BodyMassIndex {
    
    // instatnce variables
    String name;
    double weight;
    double height;

    // static variables
    public static String schoolName = "NoorTeck";

    // non- static method 
    public double bmi(){
        double result = 0;
        double resultInches = height * 12;

        // formula for calculating the weight 
        // weight / height * height * 703;
        result = (weight / (resultInches * resultInches)) * 703;
        return result;
    }

    public String weightStatus() {
		String status = "";
		double bmiResult = bmi();
		if (bmiResult < 18.5) {
			status = "Under weight";
		} else if (bmiResult >= 18.5 && bmiResult <= 24.9) {
			status = "Healthy ! ";
		} else if (bmiResult >= 25 && bmiResult <= 29.99) {
			status = "Overweight! ... go back to the gym";
		} else {
			status = "Obese !";
		}
		return status;
    }

    public void display() {
		double bmi = bmi();
		String weightStatus = weightStatus();
		System.out.println("School Name: " + schoolName);
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Weight: " + weight);
		System.out.println("Weight Status: " + weightStatus);
		System.out.println("BMI: " + bmi);
	}

    public static void shouldIGoToGym(){
        
    }
}
