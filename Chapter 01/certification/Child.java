package certification;
class Child extends Parent {
	void testIt(){
		Parent p = new Parent();
		int q = x; // no problem (inheritance)
		int d = p.x; // no problem (reference - protected behaves like default) 
					 // WOULD be problem if child is outside of certification.
	}
}