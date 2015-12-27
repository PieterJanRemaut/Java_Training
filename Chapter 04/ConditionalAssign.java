public class ConditionalAssign {
	public static void main(String[] args) {
		boolean b1, b2;
		if (b1 = true) System.out.println("b1: " + b1);
		if (true | (b2 = false)) System.out.println("b2: " + b2);
		
		
		boolean b;
		if ((b = false) | true) System.out.println("b: " + b); // b set to false, if(true)
		if (b = false | true) System.out.println("b: " + b); // b set to true, if(true)
		// if (true | b = false) System.out.println("b: " + b); // compilation fails
		if (true | (b = false)) System.out.println("b: " + b); // b set to false, if(true)
	}
}