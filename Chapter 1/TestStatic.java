import java.*; // Legal, but will NOT search across packages (and hence not do anything).
import static java.lang.System.out;
import static java.lang.Integer.*; // OK to search the java.lang.Integer class for statics when not found in this class

public class TestStatic {
	
	public static void main(String[] args) {
		out.println(MAX_VALUE);
		out.println(toHexString(42));
	}

}