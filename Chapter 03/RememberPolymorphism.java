public class RememberPolymorphism {
	public static void main(String[] args) {
		Foo f = new Bar();
		// Bar b = new Foo(); // compilation fails
	}
}

class Foo {
	public void doFooStuff() { }
}

class Bar extends Foo {
	public void doBarStuff() { }
}