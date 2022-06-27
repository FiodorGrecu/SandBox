public class BooleanExercise {
    
    public static void main(String[] args) {
		
		boolean amISleeping = sleepIn(false, false);
		System.out.println(amISleeping);
//		boolean amISleeping2 = sleepIn(true, true);
//		System.out.println(amISleeping2);
			
	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
		
		boolean result = false;
		
		if(isWeekday == false|| isVacation == true) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}

}
