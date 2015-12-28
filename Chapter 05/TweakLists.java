import java.util.*;
public class TweakLists {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("z");
		myList.add("x");
		myList.add(1,"y");
		myList.add(0, "w");
		System.out.println(myList);
		
		myList.clear();
		myList.add("b");
		myList.add("a");
		myList.add("c");
		myList.add("c");
		myList.add("c");
		myList.add("c");
		myList.add("c");
		myList.add("c");
		
		System.out.println(myList);
		System.out.println(myList.contains("a") + " " + myList.contains("x"));
		
		int b = myList.indexOf(3);
		System.out.println(b);
		System.out.println("get 1: " + myList.get(1));
		System.out.println("index of c: " + myList.indexOf("c"));
		System.out.println("index of x: " + myList.indexOf("x"));
		
		myList.remove(1);
		System.out.println("size: " + myList.size() + ", contents: " + myList);
		
		List<Integer> myIntList = new ArrayList<Integer>();
		
		myIntList.add(0);
		int c = myIntList.indexOf("Test");
		System.out.println(c);
		
		myIntList.remove("bla");
		// myIntList.add("bla"); // fails compilation
	}
}