package certification;

class DefaultChild extends DefaultParent {
	void testIt(){
		DefaultParent p = new DefaultParent();
		// Default is subclass-agnostic! That means we can refer in the package:
		int d = p.x; 
		// We can also inherit:
		int q = x;
	}
}