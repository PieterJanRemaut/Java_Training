public class PrimitiveAssignment {
	public static void main(String[] args) {
		int x = 7;
		int y = x + 2;
		int z = x * y;
		long q = 0b01101;
		byte b = 2;
		// compilation fails (needs explicit casting) for
		// byte b2 = 2 * b;
		// This, however, is fine:
		byte nine = 3*3;
		int j,k=1,l,m=k+3;
		System.out.println(x + ", " + y + ", " + z + ", " + b + ", " + nine + ", " + m);
	}

}