public class FloatingPoint {
	public static void main(String[] args) {
		// float f = 58459.854845; // compiler error
		float f2 = 58459.854845F;
		double d = 58459.854845;
		double d2 = 58459.854845F;
		
		System.out.println("float " + f2 + ", double " + d + " and hybrid " + d2);
	}
}