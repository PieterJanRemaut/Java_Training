package other;
class Neighbor {
	public static void main(String[] args){
		Child c = new Child();
		// Compilation fails for:
		System.out.println("Child inherited 'x' from Parent in other package (was protected). I can't see it: " + c.x);
	}
}