class Constructors {

	//Constructor can have any access modifier
	Constructors() {
		super();
		//The first statement in constructor
		//should be the call to super()...super(argument-args)
		//or the call to this() to other constructor overload
		//in same class
	}

	public Constructors(String call) {
		this();

	}

	protected Constructors(double amount) {
		this("Yes");
	}

	private Constructors(int size) {
		this(2.3d);
	}
}