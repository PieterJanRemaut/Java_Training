enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s) { sound = s; }
}

class TestEnum {
	int []testLegal[];
	static Animals a;
	public static void main(String[] args){
		for (int x = 0; x < 2; x++) ;
		System.out.println(a.DOG.sound);		
	}
	
}