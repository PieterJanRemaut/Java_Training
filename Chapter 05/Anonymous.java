public class Anonymous {
	private static class NiceObject {
		int var;
		NiceObject(int i) {
			var = i;
		}
	}
	
	void takesAnArray(int[] someArray) { }
	public static void main(String[] args) {
		Anonymous legion = new Anonymous();
		legion.takesAnArray(new int[] {4,7,2}); // just-in-time purpose of anonymous declaration
		
		// implicit upcast to int
		int[] weightList = new int[5];
		byte b = 4;
		short s = 5;
		char c = 'c';
		weightList[0] = b; 
		weightList[1] = s;
		weightList[2] = c;

		Object[] stuff = new Object[3];
		Object no = new NiceObject(5);
		stuff[0] = no;
		if (stuff[0] instanceof NiceObject) System.out.println("type remembered");
		if (stuff[0] instanceof NiceObject) System.out.println(((NiceObject)stuff[0]).var);
		NiceObject no2 = (NiceObject) stuff[0];
		
	}
}

