public class ConditionalPath {
	public static void main(String[] args) {
		int x;
		if (args[0] != null) { // compiler can't be sure this will work out
			x = 7;
		}
		
		if (args[0] == null) { // compiler still not sure
			x = 4;
		} else { // this fixes the problem
			x = 7;
		}
			
		x += 3; // compound assignment also qualifies as "use"
	}
}