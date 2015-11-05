import java.util.*; 
public class ArrayList{
	public static void main(String[] args){
		System.out.println("fake ArrayList class");
		ArrayList a = new ArrayList();
		java.util.ArrayList<String> b = new java.util.ArrayList<String>();
		System.out.println(b.toString());
		System.out.println(a.toString());
		// compiling fails for:
		// ArrayList<String> c = new ArrayList<String>();
	}
}