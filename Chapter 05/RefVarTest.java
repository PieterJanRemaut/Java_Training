public class RefVarTest {
	private static class NiceObject {
		int var = 3;
		NiceObject(int i) { var = i; }
		NiceObject() { }
	}
 	public static void main(String[] args) {
		int[] intArray;
		int[] someInts = new int[4];
		char[] someChars = new char[5];
		intArray = someInts; // legal
		// intArray = someChars; // illegal!
		
		Object[] stuff;
		NiceObject[] niceStuff = { new NiceObject(5), new NiceObject(0), new NiceObject() };
		stuff = niceStuff; // legal!
	}
}