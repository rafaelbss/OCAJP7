import java.util.Date;

class UnLabelContinue {

	static public void main(String[] a) {
		for(int i = 0;i < 12;i ++) {
			if(checkProblems(i)) {
				System.out.println();
				System.out.println(new Date());
				System.out.printf("Error found on iteration %d ...\n", i);
				System.out.println("This cannot stop loop...");
				System.out.println("Jump to the next iteration");

				continue;
			}

			processIteration(i);
		}
	}

	static boolean checkProblems(int iteration) {
		if(iteration == 10)
			return true; //Problem found on iteration
		else 
			return false;
	}

	static void processIteration(int iteration) {
		System.out.printf("Iteration %d processed!\n", iteration);
	}
}

class UnLabelBreak {

	public static void main(String... y) {
		for(int i = 0;i < 12;i ++) {
			if(checkProblems(i)) {
				System.out.println();
				System.out.println(new Date());
				System.out.printf("Error found on iteration %d ...\n", i);
				System.out.println("This must stop the loop...");
				System.out.println("Breaking loop...");

				break;
			}

			processIteration(i);
		}
	}

	static boolean checkProblems(int iteration) {
		if(iteration == 10)
			return true; //Problem found on iteration
		else 
			return false;
	}

	static void processIteration(int iteration) {
		System.out.printf("Iteration %d processed!\n", iteration);
	}
}

class LabelContinue {

	public static void main(String[] a) {

		File[] files = new File[3];
		files[0] = new File("File01.txt", new char[]{'A','B','C','D','E','F'});
		files[1] = new File("File02.txt", new char[]{'G','H','I','$','K','L'});
		files[2] = new File("File03.txt", new char[]{'M','N','O','P','Q','R'});


		readListOfFiles: for(int i = 0;i < files.length;i ++) {
			System.out.printf("Reading content of file: %s\n\n", files[i].name);
			readContentOfFile: for(int j = 0;j < files[i].content.length;j ++) {
									char content = files[i].content[j];
									if(content == '$') {
										//with char is $ we get error in file content
										//in this case jump to the next iterarion
										System.out.println();
										System.out.println(new Date());
										System.out.printf("Error found on iteration %d ...\n", j);
										System.out.println("This cannot stop loop...");
										System.out.printf("The char: %c found on file content is corrupted!\n", content);
										System.out.println("Jump to the next iteration");
										System.out.println();

										continue readListOfFiles;
									}

									//if ok print the char content
									System.out.print(content);
		   }

		   System.out.println();
		}
	}
}

class LabelBreak {

	public static void main(String[] a) {

		File[] files = new File[3];
		files[0] = new File("File01.txt", new char[]{'A','B','C','D','E','F'});
		files[1] = new File("File02.txt", new char[]{'G','H','I','$','K','L'});
		files[2] = new File("File03.txt", new char[]{'M','N','O','P','Q','R'});


		readListOfFiles: for(int i = 0;i < files.length;i ++) {
			System.out.printf("Reading content of file: %s\n\n", files[i].name);
			readContentOfFile: for(int j = 0;j < files[i].content.length;j ++) {
									char content = files[i].content[j];
									if(content == '$') {
										//with char is $ we get error in file content
										//in this case jump to the next iterarion
										System.out.println();
										System.out.println(new Date());
										System.out.printf("Error found on iteration %d ...\n", j);
										System.out.println("This must stop the loop...");
										System.out.printf("The char: %c found on file content is corrupted!\n", content);
										System.out.println("Stop the loop");
										System.out.println();

										break readListOfFiles;
									}

									//if ok print the char content
									System.out.print(content);
		   }

		   System.out.println();
		}
	}
}

class File {

	String name;
	char[] content;

	File(String name, char[] content) {
		this.name = name;
		this.content = content;
	}
}