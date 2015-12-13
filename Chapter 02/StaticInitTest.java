public class StaticInitTest {
	public static void main(String[] args){
		System.out.println("hello - first line");
		System.out.println(StaticInit.y);
		StaticInit s = new StaticInit();
	}
}

class StaticInit {
	static String y = "Hi";
static { System.out.println("Is this first or second line in output?");
	//int[] x = new int[4];
	//x[4] = 5;
	Object o = new Object(new Object());
	}
{ 
	System.out.println("Testing multi-line init block");
	Object o = new Object();
		int[] x = new int[4];
	x[4] = 5;
}
}