public class StringTest {
	public static void main(String[] args) {
		String x = "Java";
		String y = x; // second pointer to same String object
		y.toUpperCase(); // second String object is created and immediately abandoned
						 // both x and y still point to object "Java"
		x = x + y; // third String object created, only pointer at x is changed
		
		System.out.println(x + " " + y);
	}
}