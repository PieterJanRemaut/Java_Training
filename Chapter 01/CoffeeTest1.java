enum CoffeeSize{ BIG, HUGE, OVERWHELMING } // don't put private or protected!

class Coffee {
	CoffeeSize size;
	}

public class CoffeeTest1 {
	public static void main(String[] args){
		Coffee drink = new Coffee();
		drink.size=CoffeeSize.BIG; // enum outside of class
		System.out.println(drink.size);
	}

}