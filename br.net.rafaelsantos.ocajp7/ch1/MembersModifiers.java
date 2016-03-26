abstract class MembersModifiers {

	//INFO
	//local variables cannot use access modifiers
	//the following example is wrong way:
	//public void setTest() {
	//	public int age = 0;
	//}

	//final variables
	//only valid in methods arguments and non local vars
	//cannot be modified
	final int size = 12;

	//transient variables
	//ignore serialization to this var
	transient int goal;

	//volatile variables
	//a thread accessing the variable must always reconcilie
	//its own private copy of the variable with the master copy
	//in memory
	volatile int copy;

	//static modifier
	//exist independently of any instances for the class
	static int x = 12;

	static void setTestStatic(boolean flag) {}

	static {}
	
	//Members can use four control levels
	//public, protected, default and private

	//public access in all java universe
	public void setTestPublic(boolean flag) {}

	//protected access
	//only can be accessed inside the same package
	//or by inheritance inside or outside package
	protected void setTestProtected(boolean flag) {}

	//default access
	//only can be accessed inside the same package
	void setTestDefault(boolean flag) {}

	//private access
	//only can be acesses inside the same class
	private void setTestPrivate(boolean flag) {}

	//Non-access members modifiers
	//final, abstract, transient, synchronized
	//native, strictfp and static

	//Final methods
	//Cannot be overridden by subclasses
	final void SetTestFinal(boolean flag) {}

	//Final arguments
	//Cannot be modified inside the method
	void setTestArgumentFinal(final boolean flag) {}

	//Abstract methods
	//Need to be overridden by the first concrete subclasses
	abstract void setTestAbstract(boolean flag);

	//Synchronized methods
	//Can be accessed by only one thread at a time
	synchronized void setTestSynchronized(boolean flag) {}

	//Native methods
	//Implemented in platform-dependent code
	native void setTestNative(boolean flag);

	//Strictfp: only methods and classes
	//Forces floating points to adhere to IEEE 754 standard
	strictfp void setTestStrictfp(boolean flag) {}
}