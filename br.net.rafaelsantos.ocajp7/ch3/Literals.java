class Literals {

	private int decimal = 12;
	private int binary = 0101010;
	private int octal = 012;
	private int hex = 0x3d;

	private float _float = 12f;

	private double _double = 23d;

	private boolean bool = true?true:false;

	private char _char = 'f';
}

class Cast {

	public void doCast() {

		byte b = 1;
		short s = 1;
		int i = 12;
		long l = 23l;
		float f = 34f;
		double d = 21d;
		char c = 12;

		//Implicit cast
		i = b;
		i = s;
		i = c;

		l = b;
		l = s;
		l = i;
		l = c;

		f = b;
		f = s;
		f = i;
		f = l;
		f = c;

		d = b;
		d = s;
		d = i;
		d = l;
		d = f;
		d = c;

		//Explicit cast
		//Lost precision
		i = (int)l;
		i = (int)f;
		i = (int)d;

		l = (long)f;
		l = (long)d;

		f = (float)d;
	}
}