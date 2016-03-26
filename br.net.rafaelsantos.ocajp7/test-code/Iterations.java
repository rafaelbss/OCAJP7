public class Iterations {
	public static void main(String[] args) {
		for(int i = 0;i<2;i++) {
			System.out.println("Loop1");
			for(int x = 0;x< 3;x++) {
				
				if(x >= 0)
					continue;
				System.out.println("Loop2");
				
				for(int z = 0;z<4;z++) {
					System.out.print("Loop3");
					continue;
				}
			}
		}
	}
}