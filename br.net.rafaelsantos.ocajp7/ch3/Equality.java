class A {

	protected String a;

	public boolean equals(A instance) {
		if(instance.a.equals(this.a))
			return true;

		return false;
	}
}

class EqualityForPrimitive {

	public static void main(String[] a) {

		System.out.println(1 == 1); //true
		System.out.println('c' == 'c'); //true
		System.out.println(true == true); //true
	}
}

class EqualityForReference {

	public static void main(String[] a) {

		A a1 = new A();
		a1.a = "Loopy";

		A a2 = new A();
		a2.a = "Loopy";

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		a1 = a2;

		System.out.println(a1 == a2);
		
	}
}