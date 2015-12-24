class ScopeErrors {
	int x;
	public static void main(String[] args) {
		// x++; // cannot be referenced from static context
		ScopeErrors s = new ScopeErrors();
		s.go();
		
		for (int z = 0; z < 5; z++) {
			boolean test = false; // block scope
			if (z == 3) {
				test = true;
				break;
			}
		}
		
		// System.out.println(test); // out of scope
		
	}
	
	void go() {
		int y = 5;
		go2();
		y++; // ok: back in scope
	}
	
	void go2() {
		// y++; // obscured by nested method
	}
}