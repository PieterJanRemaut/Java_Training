public class Box {
	// protect instance vars: only directly accessible by this class.
	private int size;
	
	// Only difference with "BadOO" is that I can change my mind about how the methods behave without
	// influencing other people's code!
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		// shadowing
		this.size = size;
	}
}