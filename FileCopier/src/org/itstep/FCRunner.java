package org.itstep;

public class FCRunner {

	public static void main(String[] args) {
//		String fromPath = "C:\\Users\\User\\Desktop\\14337621999265.jpg";
//		String toPath = "E:\\Music\\14337621999265.jpg";
//		FileInPutOutPut fileIO = new FileInPutOutPut();
//		fileIO.copyFile(fromPath,toPath);
		
		String FromPath2 = "C:\\Users\\User\\Desktop\\cats.txt";
		String toPath2 = "E:\\Music\\cats.txt";

		
		FileInPutOutPut.copyTextFile(FromPath2,toPath2);
		
		System.out.println("text copied");
	}
	

}
