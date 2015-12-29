interface InterfaceWithVariable {
	int i = 27; // must be set to a value, otherwise this won't compile
}

public class VariableImplementer implements InterfaceWithVariable {
	int i; // non-static
	public static void main(String[] args) {
		System.out.println(InterfaceWithVariable.i); 
		VariableImplementer vi = new VariableImplementer();
		System.out.println(vi.i);
		
	}
}