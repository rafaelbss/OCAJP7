class Encapsulation {

	//Encapsulation provides public getter and setter for
	//private instance var
	private String name;
	private String mail;

	private int age;

	public Encapsulation(String name, String mail, int age) {
		this.name = name;
		this.mail = mail;

		this.age = age;
	}

	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public void setMail(String mail) { this.mail = mail; }
	public String getMail() { return this.mail; }

	public void setAge(int age) { this.age = age; }
	public int getAge() { return this.age; }

	public String toString() {
		return this.name;
	}
}

class EncapsulationTest {

	public static void main(String[] a) {
		System.out.println(new Encapsulation("Rafael", "rafael@rafaelsantos.net.br", 29));
	}
}