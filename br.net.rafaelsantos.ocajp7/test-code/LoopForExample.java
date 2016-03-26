public class LoopForExample {
	public static void main(String[] a) {
		int i = 0;
		int c = 0;
		for(;i++<20;i++,c++)
			System.out.println(i + "," + c);

		for(;;)
			System.out.println("Blubba");
	}
}