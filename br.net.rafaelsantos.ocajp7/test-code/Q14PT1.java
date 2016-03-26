class Q14PT1 {
	public static void main(String[] a) {
		try {
			try {

			} finally {
				try {
					throw new IllegalStateException("ISE");
				} finally {
					throw new IllegalArgumentException("IAE");
				}
				//Comment this line
				//This line is unreachable
				//throw new RuntimeException("RE");
			}
		} finally {
			System.out.println("Inside finally");
		}
	}
}