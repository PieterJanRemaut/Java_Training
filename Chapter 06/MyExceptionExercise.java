class BadFoodException extends Exception { }

public class MyExceptionExercise {
	private final static String[] BAD_FOODS = {"Champignons","Sprouts","Stuff"};
	public static void main(String[] args) {

		for (int j = 0; j < args.length; j++) {
			String f = args[j];
			try {checkFood(f); } catch (BadFoodException bf) {
				System.out.println("Calming down...");
			}
		}
	}
	
	static void checkFood(String testFood) throws BadFoodException {
		for (int i = 0; i < BAD_FOODS.length; i++) {
			if (BAD_FOODS[i].equals(testFood)) { 
				System.out.println("UGH! " + testFood + "?!"); 
				throw new BadFoodException();
			}
		}
		System.out.println(testFood + " seems pretty OK to me.");
	}
}