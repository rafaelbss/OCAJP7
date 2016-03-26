class SuperClass1 {
	String name = "Zuba";
	private SuperClass1() {

	}

	public SuperClass1(String value) {

	}
}

class SubClass1 extends SuperClass1 {
	String name = "Ahan";
	SubClass1() {
		super("Buaaa");
		System.out.println("Aha!");
	}

	public static void main(String[] a) {
		new SubClass1();
		SuperClass1 sup = new SubClass1();
		System.out.println(sup.name);

		System.out.println(-3+7);
	}
}