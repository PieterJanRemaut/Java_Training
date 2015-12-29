public class InstanceOfUnrelated {
	public static void main(String[] args) {
		IOUBar i = new IOUFoo();
		System.out.println("" + i.i + ((IOUFoo)i).i);
		i.doStuff();
		boolean b = i instanceof IOUBar;
		
	}
}

class IOUFoo extends IOUBar implements NeverMindMe { 
	int i = 25; 
	/* NECESSARY to create public override: */ 
	public void doStuff() { 
		System.out.println("foo speaking");
	}
	
	public IOUFoo() { super(); } // redundant line
	
	
}
class IOUBar { int i = 0; void doStuff() { System.out.println("bar speaking");}}

interface NeverMindMe {
		void doStuff(); // implicitly public
}