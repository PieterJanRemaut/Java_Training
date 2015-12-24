public class ValueTest {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		b = 30;
		System.out.println("a=" + a + ", b=" + b); 
		
		a = 20;
		b = a;
		a = 10;
		System.out.println("a=" + a + ", b=" + b); 		
		
	}
}