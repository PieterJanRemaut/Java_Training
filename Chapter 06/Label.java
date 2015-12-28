public class Label {
	public static void main(String[] args) {
		foo:for (int x = 3, y = 10; x < 20; x++) {
			while (y > 7) {
				y--;
			}
		}
		
		boolean isTrue = true;
		outer:
			for (int i = 0; i<5; i++) {
				while (isTrue) {
					System.out.println("Hello");
					break outer;
				}
				System.out.println("ignored");
			}
		System.out.println("All done!");
		
		outer: // same label as before is legal, no confusion possible
			for (int i = 0; i < 5; i++) {
				for (int j=0;j<5;j++) {
					System.out.println("Hello");
					continue outer;
				}
				System.out.println("ignored");
			}
		System.out.println("All done again!");
		
		// exercise
		
		int age = 0;
		outer: 
			while(age <= 21) {
				age++;
				if (age == 16) System.out.println("get your driver's license");
				else System.out.println("another year");
			}
	}
}