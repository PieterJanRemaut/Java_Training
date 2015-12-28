import java.util.*;
public class Cities {
	public static void main(String[] args) {
		List<String> c = new ArrayList<String>();
		c.add("Oslo");
		c.add("Paris");
		c.add("Rome");
		int index = c.indexOf("Paris");

		System.out.println("Index of Paris is " + index + " in " + c);
		c.add(index, "London"); // insert *before* current element at index, so this becomes new element at index
		System.out.println(c);
	}
}