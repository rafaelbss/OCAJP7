public class Gotcha {
	public static void main(String[] a) {
		//new Gotcha().go();

		try {
			new Gotcha().go();
		} catch(Error e) {
			System.out.println("outch" + e.getMessage());
		}

		
		try {
			new Gotcha().go();
		} catch(Exception e) {
			System.out.println("outch");
		}
	}

	void go() {
		go();
	}
}