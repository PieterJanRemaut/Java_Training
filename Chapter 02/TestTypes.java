public class TestTypes {
	public static void main(String[] args) {
		Animal a = new Animal();
		Horse b = new Horse();
		Animal c = new Horse();
		// compilation fails for:
		// Horse d = new Animal();
		
		if (a instanceof Animal)
			System.out.println("a Animal");
		if (!(a instanceof Horse))
			System.out.println("a NO Horse");
		if (b instanceof Animal)
			System.out.println("b Animal");
		if (b instanceof Horse)
			System.out.println("b Horse");
		if (c instanceof Animal)
			System.out.println("c Animal");
		if (c instanceof Horse)
			System.out.println("c Horse");
		
		// compilation fails for:
		// a.tie(5);
		b.tie(5);
		// compilation ALSO fails for:
		// c.tie(5); // even though c instanceof Horse!
		
		// compilation fails for:
		// TestInterface e = new TestInterface(); // abstract, so cannot be instantiated
		TestImplements f = new TestImplements();
		// compilation fails for:
		// TestInterface g = new TestImplements(); // TestImplements cannot be converted to TestInterface! 
		// compilation fails for:
		// TestImplements h = new TestInterface();
		
		if (!(f instanceof TestInterface))
			System.out.println("f NO TestInterface"); // it is IMPOSSIBLE to be instanceof TestInterface
	}

}