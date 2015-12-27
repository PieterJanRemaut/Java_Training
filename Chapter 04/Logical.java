public class Logical {
	public static void main(String[] args) {
		boolean b1 = false, b2;
		boolean b3 =  b1 && (b2 = true); // second part never executed
		System.out.println(b2); // compilation fails
	}
}