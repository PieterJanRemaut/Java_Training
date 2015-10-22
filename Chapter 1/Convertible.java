public class Convertible extends SportsCar {
	void doThings() {
		SportsCar sc = new SportsCar();
		sc.goFast(); // reference (can see)
	}
	void doMore() {
		goFast(); // inheritance
	}	
}