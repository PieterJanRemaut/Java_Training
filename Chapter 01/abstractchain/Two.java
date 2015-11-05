package abstractchain;

abstract class Two extends One {
	abstract void twoAbstractMethod();
	void twoConcreteMethod(){
		System.out.println("You reached Two's implementation.");
	}
}