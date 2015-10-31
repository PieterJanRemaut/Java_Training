enum CoffeeSize2 {
	BIG(8),
	HUGE(10),
	OVERWHELMING(16) {
		public String getLidCode(){
			return "A"; // will override class-wide getLidCode() method
		}
	}; // semicolon REQUIRED because enum code is not yet done
	
	private int ounces;
	
	CoffeeSize2(int ounces){
		this.ounces=ounces;
	}
	
	public String getLidCode(){
		return "B";
	}
}