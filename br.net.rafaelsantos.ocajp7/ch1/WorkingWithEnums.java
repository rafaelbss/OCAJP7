//Cannot be private or protected
enum CoffeeSize { BIG, HUGE, OVERWHELMING };
enum CoffeeSize3 { BIG3, HUGE3, OVERWHELMING3 }

enum CoffeeSize5 {
	BIG5(8), HUGE5(10), 

	OVERWHELMING5(120) {
		//Overridden the getSize method inside enum
		public int getSize() {
			return 120 * 28;
		}
	};

	CoffeeSize5(int size) {
		this.size = size;
	}

	private int size;

	public int getSize() {
		return this.size;
	}
}

class Coffee {
	CoffeeSize size;

	//enum declared inside a class
	enum CoffeeSize2 { BIG2, HUGE2, OVERWHELMING2 };
	enum CoffeeSize4 { BIG4, HUGE4, OVERWHELMING4 }

	CoffeeSize2 size2;
}

class CoffeeTest {
	public static void main(String[] a) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.BIG;
		drink.size2 = Coffee.CoffeeSize2.BIG2;
	}
}