class OldVarClass{
	int variable = 5;
}
public class InstanceVarOverride extends OldVarClass{
	int variable = 0;
	public static void main(String[] args){
		// Object o = new Integer(5);
		// int i = o;
		
		OldVarClass t = new InstanceVarOverride();
		System.out.println(t.variable);
	}
	
	public void eat(){}
	// public String eat(int bla){ return "hello";}

}