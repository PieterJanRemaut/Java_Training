class StaticParent {
	static int x = 0;

	static int testStaticMethod() {
		int q = 10;
		int p = 20;
		return p;
	}
}


class StaticChild extends StaticParent {
	static int x = 10;

}


public class StaticPolymorphism { 
	
	public static void main(String[] args) {
		StaticParent p = new StaticChild();
		StaticChild c = (StaticChild) p;	
		System.out.println(p.x);
		System.out.println(c.x);
		StaticParent q = new StaticParent();
		System.out.println(q.x);
		// runtime error
		// System.out.println(((StaticChild)q).x);
		
		System.out.println(c.testStaticMethod());
		
	}

} 