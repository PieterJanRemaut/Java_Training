class WonkyAccess {
	public void doPublicMethodsInDefaultClassesCompile() {
		// They do! The 'public' modifier is misleading at worst.
	}

	public static void main(String[] args) {
		System.out.println("Of course this compiles, because main is forced to be public. Otherwise, no non-public class would be allowed to have a main method!");
	}
}