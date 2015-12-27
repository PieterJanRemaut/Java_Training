class A { }
class B extends A {
	public static void main(String[] args) {
		A myA = new B();
		m2(myA);
	}
	public static void m2(A A) {
		if (A instanceof B) ((B)A).doBStuff(); // downcast
		// ((B)new A()).doBStuff(); // fail at runtime with ClassCastException
	}
	public void doBStuff() {
		System.out.println("'A' refers to a B");
	}
}