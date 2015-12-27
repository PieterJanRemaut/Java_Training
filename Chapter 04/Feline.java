class Feline {
	public static void main(String[] args) {
		long x = 42L;
		long y = 44L;
		if (x.equals(y))
			System.out.println(x+y+foo());
	}
	static String foo() {
		return "foo";
	}
}