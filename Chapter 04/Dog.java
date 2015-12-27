class Cat { }
class Dog {
	public static void main(String []args) {
		Dog d = new Dog();
		// System.out.println(d instanceof Cat); // compilation fails
		d.bark();
		
		int[] test = new int[3];
		int t2 = 4;
		System.out.println("" + test instanceof Object + t2 instanceof Object);
	}
	
	void bark() { System.out.print("woof"); }
}