public class CoffeeTest3 {
	enum CoffeeSize { BIG, HUGE, OVERWHELMING };
	CoffeeSize size;	
	
	public static void main(String[] args){
		CoffeeTest3 drink = new CoffeeTest3();
		drink.size = CoffeeSize.OVERWHELMING; 
		System.out.println(drink.size);
		
	}
	
	
	
	
}