public abstract class MultipleInheritance extends Foo implements Interface1 {
	//public static void main(String[] args) {
		
	//}
}


interface Interface1 {
	void interfaceMethod();
	
}


interface Interface2 {
    //String interfaceMethod();
	void coolMethod();
}

interface Interface3 extends Interface1, Interface2 {
	void extraMethod();
}

abstract class Foo implements Interface3 { }
