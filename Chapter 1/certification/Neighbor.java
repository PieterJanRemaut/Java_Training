package certification;
public class Neighbor {
	public static void main(String[] ars){
		Parent p = new Parent();
		// protected is similar to default in the sense that we can invoke (see) methods by reference:
		System.out.println("p's x is: " + p.x);
		// We do not, however, automatically inherit variables or methods:
		Neighbor n = new Neighbor();
		// System.out.println("Compilation fails for: " + n.x);
	}	
}