//Methods arguments are always copies

class MyClass {
	protected String name;
}

class PassingReferenceParams{

	public void doUpdate(MyClass param) {

		param = new MyClass();
		param.name = "Value changed";
	}

	public void doUpdateAttributeObject(MyClass param) {

		param.name = "Value changed";
	}

	public static void main(String[] a) {
		PassingReferenceParams ok = new PassingReferenceParams();
		MyClass cls = new MyClass();
		cls.name = "Orignally value";

		ok.doUpdate(cls);

		System.out.println("Value after method: " + cls.name);

		ok.doUpdateAttributeObject(cls);

		System.out.println("Value after method: " + cls.name);
	}
}