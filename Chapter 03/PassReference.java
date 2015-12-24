import java.awt.Dimension;
public class PassReference {
	public static void main(String[] args) {
		Dimension d = new Dimension(5,10); // first reference to dimension object
		PassReference pr = new PassReference();
		System.out.println("original height: " + d.height);
		pr.modify(d);
		System.out.println("altered height: " + d.height);
	}
	
	public void modify(Dimension dim) { // second reference to dimension object
		dim.height += 1; // height attribute of actual object is changed, all references will see this change
		System.out.println("dim height: " + dim.height);
	}
}