class NumberException {

	public static void main(String[] args) {
		try {
			Integer.parseInt("dois");

		} catch(NumberFormatException e) {
			e.printStackTrace();
		}

		try {
			Integer.parseInt("tres");
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
}