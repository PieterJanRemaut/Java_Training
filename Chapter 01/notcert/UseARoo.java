package notcert;
import cert.Roo;
class UseARoo {
	public void testIt(){
		Roo r = new Roo();
		System.out.println(r.doPrivateRooThings()); // compiler error
	}
}