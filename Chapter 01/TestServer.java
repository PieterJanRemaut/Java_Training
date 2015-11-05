class TestServer {
	int ramUsed;
	public void logIn(){
		// local variable (lives on the stack)
		int count;
		// OK (default value)
		System.out.println(ramUsed);
		// compilation fails for:
		System.out.println(count); // uninitialized local var
	}
	
	public void doSomething(int i){
		count = i; // won't compile: wrong scoping
		
	}
}