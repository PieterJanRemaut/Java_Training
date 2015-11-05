class SubClass extends SuperClass {
	public void sacredArgument(final int x) {
		x=x+1; //illegal (although error is obscured by code below when compiling).
	}
	public void showSample() {// illegal override
		System.out.println("Quite another.");
	}
}