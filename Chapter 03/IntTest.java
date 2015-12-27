public class IntTest {
	int j;
	public static void main(String[] args) {
		int i;
		// i++; // not initialized
		IntTest it = new IntTest();
		it.j++;
		System.out.println(it.j);
	}
}