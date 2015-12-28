public class ElseIf {
	public static void main(String[] args) {
		int x = 1;
		if ( x==3 );
		else if (x < 4) System.out.println("<4");
		else if (x < 2) System.out.println("<2"); // although condition is true, previous else if has been chosen
		else System.out.println("else");
	
		if (true)
			if (false);
			else System.out.println("I hit, because I'm associated to if (false).");
		
		int p = 5;
		int q = 2;
		if (((q > 3) && (p < 2)) | true) {
			System.out.println("true");
		}
		
		if ((q > 3) || (p > 2) && false) {
			System.out.println("nope!");
		}
	}
}