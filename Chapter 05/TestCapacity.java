public class TestCapacity {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("0123456789");
		sb.insert(5,sb);
		System.out.println(sb);
		StringBuilder sb2, sb3;
		sb3 = null;
		sb2 = new StringBuilder("bla");
		sb.append(sb2);
		System.out.println(sb);
		
		
		sb3 = new StringBuilder("blablabla");
		sb3.delete(3,6); // deletes indices 3, 4, 5
		System.out.println(sb3);
		
		sb = new StringBuilder("foo");
		sb2 = sb.append("bar");
		System.out.println(sb.toString() + sb2.toString());
		
		sb3 = new StringBuilder("A man a plan a canal Panama");
		System.out.println(sb3.reverse()); // sb3 itself updated in this line!
	}
}