class Emu {
	static String s = "-";
	public static void main(String[] a) {
		try {
			throw new Exception();
		} catch(Exception e1) {
			try {
				try {
					throw new Exception();
				} catch(Exception e2) {
					s += "ic ";
				}
				throw new Exception();
			} catch(Exception e3) {
				s += "mc ";
			} finally {
				s += "mf ";
			}
		} finally {
				s += "of ";
		}
		System.out.println(s);
	}
}