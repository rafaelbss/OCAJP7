class ArraysUtil {

	public static void main(String[] a) {
		int[][][][][] array = new int[5][4][3][2][1];

		System.out.println("array[0] length: " + array[0].length);
		array[0] = new int[18][34][56][89];
		System.out.println("array[0] length: " + array[0].length);

		System.out.println("array[1] length: " + array[1].length);
		array[1] = new int[18][34][56][89];
		System.out.println("array[1] length: " + array[1].length);

		System.out.println("array[2] length: " + array[2].length);
		array[2] = new int[18][34][56][89];
		System.out.println("array[2] length: " + array[2].length);

		System.out.println("array[3] length: " + array[3].length);
		array[3] = new int[18][34][56][89];
		System.out.println("array[3] length: " + array[3].length);

		System.out.println("array[4] length: " + array[4].length);
		array[4] = new int[18][34][56][89];
		System.out.println("array[4] length: " + array[4].length);

		System.out.println("array[4][17] length: " + array[4][17].length);
		array[4][17] = new int[45][67][90];
		System.out.println("array[4][17] length: " + array[4][17].length);

		System.out.println("array[4][17][44] length: " + array[4][17][44].length);
		array[4][17][44] = new int[250][390];
		System.out.println("array[4][17][44] length: " + array[4][17][44].length);

		System.out.println("array[4][17][44][249] length: " + array[4][17][44][249].length);
		array[4][17][44][249] = new int[600];
		System.out.println("array[4][17][44][249] length: " + array[4][17][44][249].length);

		int[] anonimous = new int[]{0,1,2};
		int[][] anonimous2 = new int[][]{{0,1,2}, {3,5}, {}, {}, {}};
		System.out.println(anonimous2[0].length);
		System.out.println(anonimous2[1].length);
		System.out.println(anonimous2[2].length);
		System.out.println(anonimous2[3].length);
		System.out.println(anonimous2[4].length);

		System.out.println();

		int[][] anonimous3[] = new int[][] []{ 
												{{123},{23456}},
												{{23,45}},
												{{},{}} 
											  };

		System.out.println("anonimous3[0] length: " + anonimous3[0].length);
		System.out.println("anonimous3[1] length: " + anonimous3[1].length);
		System.out.println("anonimous3[2] length: " + anonimous3[2].length);

		System.out.println("anonimous3[0][0] length: " + anonimous3[0][0].length);
		System.out.println("anonimous3[0][1] length: " + anonimous3[0][1].length);

		System.out.println("anonimous3[1][0] length: " + anonimous3[1][0].length);

		System.out.println("anonimous3[2][0] length: " + anonimous3[2][0].length);
		System.out.println("anonimous3[2][1] length: " + anonimous3[2][1].length);

		ArrayClass1[] array2 = new ArrayClass2[2];

		short[] s = new short[]{1,2,3,4,5};
		
		int[] arrayInt = new int[] {s[0], s[1], s[2]};
	}
}

class ArrayClass1 {}

class ArrayClass2 extends ArrayClass1 {}