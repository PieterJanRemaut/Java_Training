public class Driver {
	void doDriverStuff(){
		SportsCar car = new SportsCar();
		car.goFast(); //reference (can see)
	
		Convertible con = new Convertible();
		con.goFast(); //reference (can see)
	}
	
}