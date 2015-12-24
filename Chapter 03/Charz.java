public class Charz {
	public static void main(String[] args) {
		char a = '@';
		// char b = @; // fails compilation
		char N = '\u004E';
		char tab = '\t';
		char Dquote = '\"';
		char myInt = 0x892;
		char myInt2 = 982;
		char what = (char) -98;
		System.out.println(a + ", " + tab + ", " + Dquote + ", " + N + ", " + myInt + ", " + myInt2 + ", " + what);	
	}
}