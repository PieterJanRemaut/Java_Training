public class BasicExceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
		} catch (Exception e) {
			System.out.println("caught it");
		} finally {
			System.out.println("cleaned");
		}
		
		go();
	}
	
	static void go() {
		doStuff();
	}
	
	static void doStuff() {
		String[] o = new String[5];
		// int x = 5/0; // ArithmeticException
		System.out.println(o[3].toString()); // nullpointer, stack trace printed
		String s = o[6]; // out of bounds, but obscured by line above
	}
}