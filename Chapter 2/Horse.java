public class Horse extends Animal {
	private Halter myHalter;
	
	public void gearUp(){
		// HAS-A: invoke Halter methods in Horse class.
		int i=0;
		myHalter.tie(i);
	}
}