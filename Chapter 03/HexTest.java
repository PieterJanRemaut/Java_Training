public class HexTest {
	public static void main(String[] args) {
		long x = 0xDeadCafeL;
		long x2 = 0XdEADcAFEl;
		int y = 0xdEADcAFE;
		int y2 = 0XDeadCafe;
		System.out.println(x + " & " + x2 + " vs " + y + " & " + y2);
	}
}