class A {
	A() {
		this(7);
	}

	A(int size) {
		this();
	}
}

class B {
	A a = new A();
}