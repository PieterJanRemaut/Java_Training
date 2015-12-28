interface Sporty {
	void beSporty();
}
class Ferrari extends Car implements Sporty {
	public void beSporty() {
		System.out.println("vroooom");
	}
}
class Car { }
class AthleticShoe { }
class RacingFlats extends AthleticShoe implements Sporty {
	public void beSporty() {
		System.out.println("...");
	}
}
class GolfClub { }

class SportyTest {
	public static void main(String[] args) {
			Sporty[] sportyThings = new Sporty [3];
			sportyThings[0] = new Ferrari();
			sportyThings[1] = new RacingFlats();
			// sportyThings[2] = new GolfClub(); // compilation fails
	}
}