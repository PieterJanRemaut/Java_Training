public class LoopSyntax {
	public static void main(String[] args) {
		System.out.println("while: ");
		int x = 2;
		while (x == 2) {
			System.out.println(x);
			++x;
		}
		
		//while (true) { // compilation fails only if some code is written below the infinite loop
		//	System.out.println("compile time?");
		//}
		
		
		System.out.println("do: ");
		do {
			System.out.println(++x);
		} while (x == 2);
		
		
		System.out.println("basic for: ");
		for (int i = 0, j = 50; i < 3; System.out.println("incrementing"), System.out.println("still busy...")) {
			System.out.println(i);
			i++;
		}
		System.out.println(doStuff());
	
	
		System.out.println("enhanced for: ");
		int[] a = {1,2,3,4};
		for (int n : a) {
			System.out.print(n);
		}
	
	
	}
	
	static boolean doStuff() {
		for (int x = 7; x < 10; x++) {
			System.out.println(x);
			return true;
		}
		return false; // needs to be here because compiler doesn't "see" return, however, true is returned always
	}
}