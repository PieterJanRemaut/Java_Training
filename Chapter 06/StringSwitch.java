public class StringSwitch {
	public static void main(String[] args) {
		String s = "blue";
		
		switch(s) {
			case "red": System.out.print("red ");
			case "blue": System.out.print("blue ");
			case "green": System.out.print("green ");
			default: System.out.println("done");
		}
		
		int x = (int)(10*Math.random());
		switch(x){
			default: System.out.println(x + " is odd"); break; // works as intended, but very confusing!!
			case 0:
			case 2:
			case 4:
			case 6:
			case 8:
			case 10: System.out.println(x + " is even"); break;
		}
	}
}