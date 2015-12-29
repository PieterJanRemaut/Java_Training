public class Recap {
	public static void main(String[] args) {
		byte B = (byte) 90000; System.out.println(B);
		Fooz f = new Fooz();
		// Barz b = (Barz) f; // runtime failure
		
		int i = 50;
		
		B += i; System.out.println(B); // implicit DOWNcast in "+="
		doStuff();
	}
	
	static void doStuff() {
		int x = 4;
		System.out.println(x);
		doStuff2();
		
		String s;
		// if (s == null) System.out.println("confirmed"); // compiler no bueno!
	}
	
	static void doStuff2() {
		// System.out.println(x); // cannot find symbol (doStuff2 can be run apart from doStuff)
		int x = 3;
		System.out.println(x);

	}
}

class Fooz  { }

class Barz extends Fooz { }