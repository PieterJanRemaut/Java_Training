public abstract class Car {
	private double price;
	private String model;
	private String year;
	public abstract void goFast();
	public abstract void goUpHill();
	public abstract void impressNeighbors();
	// Additional, important, and serious code goes here.
	
	// nonabstract method is allowed in abstract class, but presence of abstract methods requires abstract class.
	public double getPrice(){
		return price;
	}
	
	

}