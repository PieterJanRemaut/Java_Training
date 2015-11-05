// conceptual example of what to think of when thinking about an enum

class CoffeeSize {
	private String enumName;
	private int index;
	public static final CoffeeSize BIG = new CoffeeSize("BIG",0);
	public static final CoffeeSize HUGE = new CoffeeSize("HUGE",1);
	public static final CoffeeSize OVERWHELMING = new CoffeeSize("OVERWHELMING",2);
	
	CoffeeSize(String enumName, int index) {
		// uses shadowing
		this.enumName=enumName;
		this.index=index;
	}
	
	// test implicit toString() behaviour
	public String toString(){
		return enumName;
	}
		
	
	public static void main(String[] args){
		// great success!
		System.out.println(CoffeeSize.BIG);
	}
}