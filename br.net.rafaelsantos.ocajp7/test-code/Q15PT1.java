class Q15PT1 {

	static public void main(String[] a) {
		//In this case if I call fruit.whatIs
		//although the object type is Mango and whatIs
		//method inside Mango does not throw the Exception
		//In polymorphism we need to consider the exception
		//which was launched in the method that is being overridden
		
		//this code will not compile
		//we need to handle the exception
		//Fruit fruit = new Mango();
		//fruit.whatIs();
	}
}

class $Q15PT1 {

	public static void main(String[] a) {
		Mango mango = new Mango();
		mango.whatIs();
	}
}

class Fruit {
	public void whatIs() throws Exception {
		System.out.println("Is a fruit");
	}
}

class Mango extends Fruit {
	public void whatIs() {
		System.out.println("Is a mango");
	}
}