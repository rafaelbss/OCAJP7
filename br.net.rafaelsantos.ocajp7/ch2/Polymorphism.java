import java.io.IOException;
import java.io.FileNotFoundException;

interface A {}

interface B {}

interface C {}

interface D {}

interface E {}

interface F {}

//One interface can extend multiple interfaces
interface Animatable extends A, B, C {

	public void displayShape();
	public void doKaboom();

	Animatable getAnimatable() throws IOException, FileNotFoundException;
}

//One class can implement multiple interfaces
class GameShape implements Animatable, D, E, F  {

	public void displayShape() {
		System.out.println(this.toString());
	}

	public void doOverLoad(int amount) { System.out.println("AMMOUNT Overload Method!"); }

	//Overriden doKaboom method from interface Animatable
	public void doKaboom() {
		System.out.println("KABOOM " + this.toString());
	}

	void doOver() { System.out.println("OVER"); }

	//Overridden rule: can be covariant return 
	//Overridden rule: method only can throw unchecked exceptions
	/*Overridden rule: the new method does not need to throw exceptions 
					   that were thrown in the method that is being replaced
					   in this case the Exception FileNotFoundException
					   it not need to be launched in the new method*/
	public GameShape getAnimatable() throws NullPointerException, SubIOException {
		return this;
	}

	public String toString() {
		return "GameShape.class";
	}

	//This method cannot be overridden
	final void doIt() {}

	//This method cannot be overridden
	static void doIt2() {}
}

class PlayerPiece extends GameShape {

	public void displayShape() {
		System.out.println(this.toString());
	}

	//Overriden doKaboom method from interface Animatable
	public void doKaboom() {
		System.out.println("KABOOM " + this.toString());
	}

	//Overridden rule: access modifier can be less restrictive
	protected void doOver() { System.out.println("Do Over Overridden"); }

	//Overload rule: methods MUST change the argument list
	//Overload rule: methods CAN change the return type
	//Overload rule: methods CAN change the access modifier
	//Overload rule: methods CAN declare new or broader checked exceptions
	protected Integer doOverLoad(Integer amount) throws IOException { return null;  } 

	public String toString() {
		return "PlayerPiece.class";
	}

	static void doIt2() {}
}

class PolymorphismTest {

	public static void main(String[] a) {
		//Using polymorphism
		Animatable shape = new GameShape();
		shape.displayShape();
		shape.doKaboom();

		System.out.println(shape);
		
		shape = new PlayerPiece();
		shape.displayShape();
		shape.doKaboom();

		System.out.println(shape);

		System.out.println();

		Object[] instances = { new Object(), new GameShape(), new PlayerPiece() };

		GameShape shapeGame = new PlayerPiece();
		//Overload does not work with Polymorphism
		//Integer value = shapeGame.doOverLoad(new Integer(12));

		for(Object instance : instances)
			if(instance instanceof Animatable)
				((Animatable)instance).displayShape();
			else
				System.out.println(instance + " is not a Animatable");

		//Using Cast
		//Compile ok, but when you run it throws a ClassCastException
		//PlayerPiece is a GameShape but GameShape is never be a PlayerPiece
		shapeGame = new GameShape();
		//PlayerPiece player = (PlayerPiece)shapeGame;

		PlayerPiece player = new PlayerPiece();
		//Upcast: no explicit cast is necessary
		//PlayerPiece is a GameShape
		shapeGame = player;

		//Upcast with explicit cast, but is not necessary
		shapeGame = (GameShape)player;
	}
}

class SubIOException extends IOException { }