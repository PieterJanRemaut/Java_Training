public class Horse extends Animal {
	private Halter myHalter;
	
	Horse() {
		myHalter = new Halter();
	}
	public void gearUp(){
		// HAS-A: invoke Halter methods in Horse class.
		int i=0;
		myHalter.tie(i);
	}
	
	// Delegating tie method to Halter class: users of this class don't need to know that Halter class is used
	public void tie(int rope) {
		myHalter.tie(rope);
	}
}