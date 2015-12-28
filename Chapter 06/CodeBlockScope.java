public class CodeBlockScope {
	public static void main(String[] args) {
		int x = 0;
		if (x == 0) {
			int y = 3; // scope: if block
		} else {
			int y = 4; // scope: else block
		}
		// System.out.println(y); // out of scope
	}
}