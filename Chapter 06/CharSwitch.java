public class CharSwitch {
	public static void main(String[] args) {
		char c = 'c';
		int x = (int)c; System.out.println(x);
		switch(c) {
			case 'd': break;
			default: System.out.println("default"); break;
			case 'c': System.out.println("hurray!"); break;
			case 0:  break;
		}
		System.out.println("post switch");
	}
}