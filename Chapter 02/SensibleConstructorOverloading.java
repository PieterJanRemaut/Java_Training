public class SensibleConstructorOverloading {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Animal("PJ");
		System.out.println(a.name);
		System.out.println(b.name);
	}
}

class Animal {
	String name; 
	
	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = (new String[] {"A", "B", "C", "D", "E"})[x];
		return name;
	}
	
	Animal(String s) {
		name = s;
	}
	
	Animal() {
		this(makeRandomName());
	}
}

