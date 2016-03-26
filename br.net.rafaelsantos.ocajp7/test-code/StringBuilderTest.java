public class StringBuilderTest {
	public static void main(String[] a) {
		String s = "bob";
		String[] sa = {"a", "bob"};
		final String s2 = "bob";
		StringBuilder sb = new StringBuilder("bob");

		switch(sa[1]) {
			case "ann":
				break;
		}

		switch("b" + "ob") {
			case s:
				break;
		}

		switch(sb.toString()) {
			case s2:
				break;
		}
	}
}