public class Switcharoo {
	public static void main(String[] args) {
		double x = 3;
		switch ((int)x) { // does not compile without cast
			case 1:
				System.out.println("x equals 1");
				break;
			case 2:
				System.out.println("x equals 2");
				break;
			default: 
				System.out.println("dunno lol");
		}
		
		final int a = 1;
		final int b;
		b = 1;
		int q = 0;
		switch(q) {
			case a: 
			// case b: ; // fails compilation, no "compile-time constant"
			default: { }
			case 0: { System.out.println("hello"); }
			// case 1: // compilation fails: duplicate case
		}
		
		byte g = 2;
		switch (g) {
			case 23:
			// case 128: // compilation fails
		}
		
	}
}