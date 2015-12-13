public class Returning  {

	public static void main(String[] args) {
		Returning r = new Returning();
		int j = r.ruleFour();
		Integer i = j;
		String s = i.toString();
		System.out.println(s + j);
	}
	
	
	public String ruleOne() {
		return null;
	}
	
	//public int ruleOneTest() {
	//	return null;
	//}
	
	public int ruleThree() {
		char c = 'c';
		return c;
	}
	
	public int ruleFour() {
		float f = 2.5f;
		return (int) f;
	}
	
	public void ruleFive() {
		return;
	}
	
	public Object ruleSix() {
		return "string";
	}
	
	
}