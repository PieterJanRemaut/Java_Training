public class Anonymous {
	void takesAnArray(int[] someArray) { }
	public static void main(String[] args) {
		Anonymous legion = new Anonymous();
		legion.takesAnArray(new int[] {4,7,2}); // just-in-time purpose of anonymous declaration
	}
}
