import java.util.Date;

public class GarbageFactory {
	public static void main(String[] args) {
		Date d = getDate();
		// doComplicatedStuff();
		System.out.println("d = " + d); // Date object created in getDate() not eligible for GC, StringBuffer is
	}
	
	public static Date getDate() {
		Date d = new Date(); // shadowed
		StringBuffer now = new StringBuffer(d.toString());
		System.out.println(now);
		return d;
	}
}