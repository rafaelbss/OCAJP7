//Interfaces are 100% abstract
//The modifier abstract is optional

/* abstract */ interface MyInterface {

	//Var in interfaces are
	//public, static and final by default
	//This modifiers are optional
	/* public static final */ int WIDTH = 23;

	//Methods in interfaces are
	//public and abstract by default
	//This modifiers are optional
	//And the method must be implemented in a class
	/* public abstract */ void setWidth(int value);
}

class MyImplementingClass implements MyInterface {

	int width;

	public void setWidth(int value) { value = WIDTH + 45; this.width = value; }

	public int getWidth() { return this.width; }
}