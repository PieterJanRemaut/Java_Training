public class ArrayTest {
	public static void main(String[] args) {
		int[][] numberlists = new int[3][2];
		
		String[] loopTest = new String[6];
		
		for(int x = 0; x < loopTest.length; x++) {
			loopTest[x] = new String("bla" + x);
		}
		
		for(int x = 0; x < loopTest.length; ++x) {
			System.out.println(loopTest[x]);
		}		
		
		int x = 3;
		int[] test =  { 5     , x       , 3 }    ;
		
		x = 10;
		System.out.println(test[1]);
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object[] stuff = {o1,o2};
		o1 = o2;
		if (o1 == o2) System.out.println("control group");
		if (stuff[0] != stuff[1]) System.out.println("actual test passed");
		
		
		Object[] newStuff = new Object[] {o1,o2};
		
	}
}