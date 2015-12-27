public class Xcrement {
	static int players = 0;
	public static void main(String[] args) {
		System.out.println("Players online: " + players++);
		System.out.println("Players online now: " + players);
		System.out.println("Finally, players online: " + ++players);
		
		int x = 2; int y = 3;
		if ((y == x++) || 
			(x < ++y)) /* This x is 3! */
		System.out.println("x: " + x + ", y: " + y);
		
		final int q = 3;
		// int q2 = q++; // compilation fails
	}
}