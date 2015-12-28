import java.io.*;
public class Test {
	public static void main(String[] args) {
		nullPointer();
	}
	
	public int myMethod1() throws EOFException {
		return myMethod2();
	}
	
	public int myMethod2() throws EOFException {
		// actual throwing code
		return 1;
	}
	
	public static void nullPointer() {
		String[] s = new String[1];
		try { s[0].length();
		} catch (NullPointerException np) {
			if (s[0] != null) throw np; // damn, can't handle that!
			else {
				System.out.println("Oh, it's just s[0] being null. No biggy! I'll print stackTrace but continue.");
				np.printStackTrace();
			}
		} finally {
			System.out.println("Still running fine :-)");
		}
	}
	
	public void throwMyEx() throws MyException, Error { // checked exception, so "throws" necessary
		throw new MyException();
	}
	
	public void throwMyRTEx() { // unchecked exception (subclass of RuntimeException): no "throws"
		throw new MyRuntimeException();
	}
}