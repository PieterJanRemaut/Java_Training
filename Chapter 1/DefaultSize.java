class DefaultSize {
	final int size = 10;	
	public DefaultSize(){
		size=20;
	}
	public void setSize(int size) {
		size=24; // compiles only if size has no default value
		
		
	}
	
}