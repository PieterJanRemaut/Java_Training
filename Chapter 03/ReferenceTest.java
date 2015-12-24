import java.awt.Dimension;
class ReferenceTest {
	public static void main(String[] args) {
		Dimension a1 = new Dimension(5,10);
		System.out.println("a1.height = " + a1.height);
		Dimension b1 = a1;
		b1.height = 30;
		System.out.println("a1.height after b1 change = " + a1.height);
	}
}