public class ObscureInstanceOf {
	private static class Foo implements MyInterface2 { }
	private static class Bar extends Foo { }
	private interface MyInterface2 extends MyInterface { } // 'implements' not allowed here
	private interface MyInterface { }
	
	public static void main(String[] args) {
		Bar b = new Bar();
		if (b instanceof MyInterface) System.out.println("yup");
	}
}
