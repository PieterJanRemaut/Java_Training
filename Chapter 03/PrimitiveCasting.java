public class PrimitiveCasting {
	public static void main(String[] args) {
		int a = 100;
		long b = a; // ok
		
		float f = 100.001f;
		int g = (int)f; // needs explicit cast
		// int i = 4838.5489548;
		int i2 = (int)4838.5489548;
		
		long L = 130L; // outside byte range
		byte B = (byte)L;
		
		float f2 = 984489498984894.495f;
		short s = (short) f2;
		
		byte bytetest = (byte)128;
		int inttest = (byte)128;
		
		byte Q = 3;
		Q += 7; // works, although
		byte Q2 = (byte) (Q + 7); // needs explicit cast!
		System.out.println(b + ", " + g + ", " + i2 + ", " + B + ", " + s + ", " + bytetest + 
		", " + inttest + ", " + Q2);
	}

}