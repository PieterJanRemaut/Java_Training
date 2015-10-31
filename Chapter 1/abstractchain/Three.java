package abstractchain;

class Three extends Two {
		// required but not specified in direct parent!
		void oneAbstractMethod(){
		System.out.println("Three's oneAbstractMethod");
	}
	
	void twoAbstractMethod(){
		System.out.println("Three's twoAbstractMethod");
	}
	
	void threeMethod(){
		System.out.println("Three's threeMethod");
	}
	public static void main(String[] args){
		Three three3 = new Three();
		three3.oneAbstractMethod();
		three3.twoAbstractMethod();
		three3.threeMethod();
		three3.oneConcreteMethod();
		three3.twoConcreteMethod();
	}
}