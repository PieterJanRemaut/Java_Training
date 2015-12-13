public class PolymorphicOverload {
	public static void main(String[] args) {
		MethodProvider m = new MethodProvider();
		Super s = new Super();
		Sub p = new Sub();
		Super weird = new Sub();
		
		m.coolMethod(s);
		m.coolMethod(p);
		m.coolMethod(weird);
		
		
		
	}

}

class Super { }

class Sub extends Super { }

class MethodProvider {
	public int coolMethod(Super s) {
		System.out.println("Super");
		return 0;
	}	
	
	void coolMethod(Sub p) {
		System.out.println("Sub");
	}
}