public class ArrayInit {
	static int [] year = new int[100];
	static int[] year2;
	public static void main(String[] args) {
		for (int i=0; i<100; i++) {
			System.out.println("year[" + i + "] = " + year[i]);
		}
		
		System.out.println("year2 equals " + year2);
		// System.out.println("This means that year2's elements cannot be fetched: " + year2[0]); // nullpointer
	}
}