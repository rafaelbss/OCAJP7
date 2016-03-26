public class Flipper {
	public static void main(String[] args) {
		String o = "-";

		switch("FRED".toLowerCase().substring(1,3)) {
			case "yellow" :
				o += "y";
			case "red" :
				o += "r";
			case "green":
				o += "g";
		}

		//substring method
		//substring(initial, final - 1)

		System.out.println(o);
	}
}