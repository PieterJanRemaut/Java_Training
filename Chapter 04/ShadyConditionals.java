public class ShadyConditionals {
	public static void main(String[] args) {
		boolean b = false;
		if (b = true) System.out.println("b set to true"); // confusing, but can only occur with booleans
		int i = 0;
		// if (i = 1) System.out.println("i set to 1"); // compilation fails
	}
}