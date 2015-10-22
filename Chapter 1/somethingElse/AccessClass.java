package somethingElse;
import certification.OtherClass;
class AccessClass {
	static public void main(String[] args)  {
		OtherClass o = new OtherClass();
		o.testIt(); // invisible
	}
}