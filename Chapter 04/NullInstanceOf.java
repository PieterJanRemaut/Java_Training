public class NullInstanceOf {
	public static void main(String[] args) {
		String a = null;
		boolean b = null instanceof String;
		boolean c = a instanceof String;
		boolean d = null instanceof Object;
		System.out.println("" + b + c + d);
		System.out.println(b);
	}
}