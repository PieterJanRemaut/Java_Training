public class WillWeCompile {
	public static void main(String[] args) {
		String s = null; // stores "null"
		boolean b1 = true, b2 = true;
		// System.out.println(b1 + b2 + ""); // nope! does work, however, if string is second or first
		if (s instanceof Object) System.out.print("nope"); // I believe this will compile
		
		double i = 2, j = 5;
		double d = (double)5/2; System.out.println(d);
		
		int x = 3;
		System.out.println(++x *(-1));
	}
}