package notcert;
import cert.Roo;
public class Cloo extends Roo {
	public void testCloo() {
		System.out.println(doRooThings()); // fine
		System.out.println(doPrivateRooThings()); // compiler error
	}
}