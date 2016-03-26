class Constructors {

	private Constructors(int value) { System.out.println("Constructor private run: " + value); }

	Constructors(String value) { this(12); System.out.println("Constructor default run: " + value); }

	protected Constructors(float value) { this("Zooba!"); System.out.println("Constructor protected run: " + value); }

	public Constructors(double value) { this(23.4f); System.out.println("Constructor public run: " + value); }

	//Run when the class is loaded for the first time
	static { System.out.println("Static block 1 runs"); }

	//Run when the class is loaded for the first time
	static { System.out.println("Static block 2 runs"); }

	//Run everytime a class instance is created. Run after super()
	{ System.out.println("Instance block 1 runs"); }

	//Run everytime a class instance is created. Run after super()
	{ System.out.println("Instance block 2 runs"); }

	public static void main(String[] a) {
		new Constructors(12);
		new Constructors("HJK");
		new Constructors(12.3f);
		new Constructors(12.34d);
	}
}