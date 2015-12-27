public class GuessAnimal {
	public static void main(String[] args) {
		String animal = "unknown";
		int weight = 700;
		char sex = 'm';
		double colorWavelength = 1.630;
		if (weight >= 500) { animal = "elephant"; }
		if (colorWavelength > 1.621) { animal = "gray " + animal; }
		if (sex <= 'f') { animal = "female " + animal; }
		System.out.println("We're looking at a(n) " + animal);
	}
}