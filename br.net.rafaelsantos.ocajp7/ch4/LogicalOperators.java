class LogicalOperators {

	public static void main(String[] a) {
		System.out.println(true | false);
		System.out.println(true & false);

		int z = 5;
		if(++z > 5 || ++z > 6) System.out.println(++z);

		z = 5;
		if(++z > 5 | ++z > 6) System.out.println(++z);
		System.out.println(z);

		System.out.println(true ^ true);
		System.out.println(true ^ false);

		System.out.println(!true);
	}
}