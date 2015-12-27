public class MediumCircuit {
	public static void main(String[] args) {
		int z = 5;
		if (++z > 5 || ++z > 6) z++;
		System.out.println(z);
		
		int q = 5;
		if (++q > 5 | ++q > 6) q++;
		System.out.println(q);
	}
}