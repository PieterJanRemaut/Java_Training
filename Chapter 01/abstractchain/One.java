package abstractchain;

abstract class One {
	abstract void oneAbstractMethod();
	void oneConcreteMethod(){
		System.out.println("You reached One's implementation.");
	}
}