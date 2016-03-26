class Exceptions {

	static public void main(String[] a) {
		switch(Integer.parseInt(a[0]))
		{
			case 1:
				new Exceptions().doArrayIndexOutOfBoundsException();
				break;
			case 2:
				new Exceptions().doCharAtException();
				break;
			case 3:
				new Exceptions().doClassCastException();
			default:
				throw new Error("No valid option selected!");

		}
	}


	public void doArrayIndexOutOfBoundsException() {

		int[] x = new int[1];

		x[1] = 12;
	}

	public void doCharAtException() {
		String v = "ABC";

		char c = v.charAt(5);
	}

	public void doClassCastException() {
		Object o = new Object();
		Exceptions e = (Exceptions)o;
	}
}