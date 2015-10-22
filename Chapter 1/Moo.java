class Zoo {
	protected String coolMethod(){
		return "Wow baby";
	}
}
class Moo extends Zoo {
	public void useMyCoolMethod(){
		System.out.println("Moo says " + this.coolMethod()); // compiles => inherits coolMethod
		Zoo z = new Zoo();
		System.out.println("A Zoo says " + z.coolMethod()); // compiles => can see coolMethod (does not use inheritance)
	}
}
