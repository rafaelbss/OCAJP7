enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String sound) {
		this.sound = sound;
	}
}

class TestEnum {
	static Animals a;

	public static void main(String[] a2) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}