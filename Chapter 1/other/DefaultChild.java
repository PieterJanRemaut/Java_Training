package other;
import certification.*;

class DefaultChild extends DefaultParent {
	void testIt(){
		DefaultParent p = new DefaultParent();
		// Default is subclass-agnostic! Both fail:
		int q = x; 
		int d = p.x; 
	}
}