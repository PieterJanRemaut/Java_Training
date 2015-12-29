package nottt;
import tt.*;

public class ThreeTree extends TTChild {
	public static void main(String... args) {
		TTParent p = new TTParent();
		TTChild c = new TTChild();
		ThreeTree tt = new ThreeTree();
		
		// p.coolMethod(); // compilation fails
		// c.coolMethod(); // compilation fails? ambiguous
		tt.coolMethod(); // works
	}
}

class TTChild extends TTParent { }

