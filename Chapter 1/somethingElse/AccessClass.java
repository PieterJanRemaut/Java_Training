package somethingElse;
import certification.OtherClass;
class AccessClass extends OtherClass {
	static public void main(String[] args)  {
		AccessClass a = new AccessClass();
		a.testIt();
		OtherClass o = new OtherClass();
		// calling through reference is still invisible: compiler error		
		// o.testIt(); 
	}
	
}