class ArithmeticOperators {

	static int add = 12 + 20;
	static int subtract = 45 - 12;
	static int multiply = 45 * 67;
	static int divide = multiply / 2;
	static int modulus = 12 % 3;
	static int expression = (((add + subtract) * multiply) / divide) % modulus;

	public static void main(String[] a) {
		System.out.println(expression);
	}
}