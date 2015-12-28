public class Propagate {
	public static void main(String[] args) {
		String s = "";
		String t = "A man a plan a canal Panama";
	
		try {
			System.out.println(reverse(t));
			System.out.println(reverse(s));
		} catch (Exception e) {
			System.out.println("ERROR - Can't reverse an empty String!");
		} finally {
			System.out.println("Clearing cache...");
		}
	}
	
	static String reverse(String input) throws Exception {
		if (input.length() == 0) throw new Exception();
//		StringBuilder sb = new StringBuilder(input);
//		return sb.reverse().toString(); // sb is reversed now, but thrown away anyways
		String s = "";
		for (int i = input.length() -1; i >= 0; i--) {
			s += input.charAt(i);
		}
		return s;
	}
}