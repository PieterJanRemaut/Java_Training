public class CastPolymorph {
	public static void main(String[] args){
		Parent p = new Parent();
		Child c =  new Child();
		MyInterface q = new Parent();
		MyInterface d = new Child();
		
		p.interfaceMethod();
		q.interfaceMethod();
		c.interfaceMethod();
		d.interfaceMethod();
		
		c.childMethod();
		Child e = (Child) d;
		e.childMethod();
		
		Parent r = (Parent) c;
		r.interfaceMethod(); // STILL dynamic overloading, casting is irrelevant.
		
		
		p.underTheRadar();
		c.underTheRadar();
		// q.underTheRadar();
		// d.underTheRadar();
		((Child) d).childMethod();
	}
}

class Parent implements MyInterface {
	public void interfaceMethod() {
			System.out.println("Parent's interface method");
	}
	
	public void underTheRadar() {
		System.out.println("bleep bleep");
	}
}


class Child extends Parent { 
	public void childMethod() {
		System.out.println("Child method");
	}
	public void interfaceMethod() {
			System.out.println("Child's interface method");
	}	
}

interface MyInterface {
	void interfaceMethod();
}
