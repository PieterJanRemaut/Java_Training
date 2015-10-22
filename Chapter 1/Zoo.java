class Zoo {
	public String coolMethod(){
		return "Wow baby";
	}
}
class Moo {
	public void useAZoo(){
		Zoo z = new Zoo(); // compiles => can see Zoo class
		System.out.println("A Zoo says " + z.coolMethod()); // compiles => can see coolMethod
	}	
}