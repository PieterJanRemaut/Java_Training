class SubClass extends SuperClass {
	public void sacredArgument(final int x) {
		x=x+1; //illegal
	}
	public void showSample() {// illegal override
		System.out.println("Quite another.");
	}
}