class Budgie {
	public static void main(String[] args) {
		Budgie b1 = new Budgie();
		Budgie b2 = new Budgie();
		Budgie b3 = b1;
		
		String s1 = "Bob";
		String s2 = "Bob";
		String s3 = "bob"; // lowercase
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s2 = s2.toLowerCase();
		
		System.out.println(s1.equals(s2));

		
	}
}