class Q66PT1 {
	int i = 3;
}

class $Q66PT1 {

	public static void f1(Q66PT1 p) {
		p.i = 10;
	}

	public static void f2(Q66PT1 p) {
		p = new Q66PT1();
	}

	public static void main(String[] a) {
		Q66PT1 p = new Q66PT1();
		f1(p);
		System.out.println(p.i);
		f2(p);
		System.out.println(p.i);
	}
}