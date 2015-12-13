public class Constructor {
	public static void main(String[] args){
		Constructor c = new Constructor();
		c.Constructor(); // overloading rule of "only change return type not allowed" does not
						 // apply for the "make non-constructor constructor overload"-trick
		Constructor(0);
		Constructor d = new Constructor(c);
		d.Constructor();
		d.Constructor(d);
	}

	//public void Constructor() { 
	//	System.out.println("Ceci n'est pas un constructeur.");
	//	}
	
	public Constructor Constructor() {
		System.out.println("Ceci n'est pas un constructeur.");
		return this;
	}
		
	public static void Constructor(int i) { // signature change necessary - overloading rule
		System.out.println("This is static. Confused yet?");
	}
	
	// public Constructor(Object o) { } // Uncommenting causes compilation failure at line 3.
	public Constructor() { 
		super(); // already implicit
	}
	
	public Constructor(String s) { 
		this(); // needed - otherwise "super();" would be implicit
	}
	
	public Constructor(Constructor parent) {
		// this(parent.Constructor()); // recursive
		this(parent.toString());
	}
	
	Constructor Constructor(Constructor constructor){
		System.out.println("please");
		return constructor;
	}
}