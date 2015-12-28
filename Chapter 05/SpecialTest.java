public class SpecialTest {
	public static void main(String[] args) {
		Special sp = new Special();
		StringBuilder s2 = sp.getName();
		s2.append("fred");
		sp.printName();
		
		StringBuilder wp2 = sp.getWP();
		wp2.append("trolling");
		sp.printWP(); // correctly encapsulated
		
		StringBuilder sb = new StringBuilder("azertyuiop");
		int q = sb.length();
		sb.delete(3,34);
		char c = sb.charAt(0);
		System.out.println(c);
		System.out.println(sb);
	}
}

class Special {
	private StringBuilder s = new StringBuilder("Bob");
	private StringBuilder wellProtected = new StringBuilder("Can't touch this");
	StringBuilder getWP() {
		return new StringBuilder(wellProtected);
	}
	StringBuilder getName() { return s; }
	void printName() { System.out.println(s); }
	void printWP() { System.out.println(wellProtected); }
}