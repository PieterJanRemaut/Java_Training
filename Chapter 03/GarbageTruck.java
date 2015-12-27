public class GarbageTruck {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello"); // object not eligible for GC
		sb = new StringBuffer("goodbye"); // object created by new StringBuffer("hello"); eligible for GC
	}
}