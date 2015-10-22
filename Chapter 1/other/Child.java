package other;
import certification.Parent;
class Child extends Parent {
	void testIt(){
		Parent p = new Parent();
		int q = x; // no problem (inheritance)
		int d = p.x; // problem (reference)
	}
}