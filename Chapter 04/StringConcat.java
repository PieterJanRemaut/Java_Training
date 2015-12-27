public class StringConcat {
	public static void main(String[] args) {
		String a = "foo";
		int b = 3;
		int c = 6;
		
		System.out.println(a + b + c);
		System.out.println(a + 3 + 6);
		System.out.println(a+ (b + c));
		
		String s = "123";
		s += "4";
		s += 5;
		s+= 6 + 7; // numeric addition
		s+= (8 + 9); // numeric addition
		
		System.out.println(s);
		
	}
}