interface MyInterface {
	void coolMethod();
}

public class MyClass implements MyInterface {
	
	public void coolMethod(){
		//stuff
	}
	
	public static void main(String[] args) {
		MyClass m = new MyClass();
		if (m instanceof MyInterface);
			System.out.println("instanceof works for interfaces!");
	}
	
}