public class CrazyShadow {
	Bar myBar = new Bar();
	void changeIt(Bar myBar) {
		myBar.barNum = 99;
		System.out.println("myBar.barNum in changeIt: " + myBar.barNum);
		myBar = new Bar(); // change reference that is local var
		myBar.barNum = 420;
		System.out.println("myBar.barNum in changeIt v2: " + myBar.barNum);
	}
	public static void main(String[] args) {
		CrazyShadow cs = new CrazyShadow();
		System.out.println("cs.myBar.barNum: " + cs.myBar.barNum);
		cs.changeIt(cs.myBar);
		System.out.println("post-method cs.myBar.barNum: " + cs.myBar.barNum);
		
	}
}

class Bar {
	int barNum = 28;
}