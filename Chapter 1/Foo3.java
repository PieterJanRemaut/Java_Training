public class Foo3 {
	int x;
	
	protected void Foo3() {
		x= 1337;
	} 
	
	protected Foo3() { 
		x = 9;
	} 


	public static void main(String[] args){
		Foo3 y = new Foo3();
		System.out.println(y.x);
		y.Foo3();
		System.out.println(y.x);		
	}
}