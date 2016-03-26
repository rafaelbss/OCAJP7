class LivesOnStack {

	void method1LivesOnStack() {}

	void method2LivesOnStack() {}

	void method3LivesOnStack(String var1LivesOnStack) { int var2LivesOnStack = 0; }
}

class LivesOnHeap {

	private String var1LivesOnHeap;

	void method1LivesOnStack() {
		LivesOnStack stack = new LivesOnStack(); //Object LivesOnStack() Lives on Heap
		             //|--> stack var Lives on Heap
	}
}