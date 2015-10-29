public class BMWBoxster extends Car {
	
	public void impressNeighbors(){
		System.out.println("vroom");
	}
	
	public void goUpHill(){
	}
	
	public void goFast(){
	}
	
	public static void main(String[] args) {
		// Doesn't compile.
		// Car c = new Car();
		BMWBoxster b = new BMWBoxster();
		b.impressNeighbors();
	}
}