public class Book {
	private String title; // instance ref var
	public String getTitle() {
		return title;
	}
	public static void main(String[] args) {
		Book b = new Book();
		System.out.println("The title is " + b.getTitle());
		if (b.getTitle() != null) { // needed to avoid exception at runtime
			String t = b.getTitle().toLowerCase();
		}
		
		String q = "q";
		String p = q;
		q = "not p";
		System.out.println(q + " vs " + p);
	}
}