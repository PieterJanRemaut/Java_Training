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
		// compilation does NOT fail for:
		TestInterface g = new TestImplements();
		// compilation fails for:
		// TestImplements h = new TestInterface(); // abstract, so cannot be instantiated
		
		if (f instanceof TestInterface)
			System.out.println("f TestInterface"); 
		if (f instanceof TestImplements)
			System.out.println("f TestImplements"); 	
		if (g instanceof TestInterface)
			System.out.println("g TestInterface"); 
		if (g instanceof TestImplements)
			System.out.println("g TestImplements");		
		/**
		* This means that any reference variable that passes 'instanceof Interface' will also pass some
		* incarnation of 'instanceof implementer' - regardless of reference variable type!
		*/
	}

}