public class StaticShadow {
	static int size = 7;
	static void changeIt(int size) { // shadowed. Changing only the varname on this line would actually alter StaticShadow.size
		size += 200;
		System.out.println("changed size: " + size);
	}
	
	public static void main(String[] args) {
		StaticShadow ss = new StaticShadow();
		System.out.println("original size: " + size + ", or even " + ss.size);
		changeIt(size);
		System.out.println("post-method size: " + size + ", or even " + ss.size);		
	}
}