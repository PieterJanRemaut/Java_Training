public class PassPrimitive {
	public static void main(String[] args) {
		int a = 1;
		PassPrimitive pp = new PassPrimitive();
		System.out.println("original a: " + a);
		pp.modify(a);
		System.out.println("post-method a: " + a);
	}
	
	public void modify(int a) { // shadowing!
		a += 1;
		System.out.println("method's a: " + a);
	}
}