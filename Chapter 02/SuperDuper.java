public class SuperDuper {
	public static void main(String[] args) {
		
	}
	
	
}

class Foo {
	Foo(Object o) { }
}


class Bar extends Foo { 
	Bar() { 
	// Object o = new Object();
	// super(o); // too late - "super();" was already implicitly added before line 1.
	super(new Object()); // needed for compilation
	} 
}
	