package org.itstep;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileInPutOutPutTest {
	@Test
	void testCopyFile() {
		String fromPath = "C:\\Users\\User\\Desktop\\14337621999265.jpg";
		String toPath = "E:\\Music\\14337621999265.jpg";
		
		FileInPutOutPut fileIO = new FileInPutOutPut();
		fileIO.copyFile(fromPath, toPath);
		
		byte[] bytes = fileIO.readDataFromFile(toPath);
		assertTrue(bytes.length > 0 );
		
		File file = new File(toPath);
		file.delete();
		}

	@Test
	void testCopyTextFile() {
		String FromPath2 = "C:\\Users\\User\\Desktop\\cats.txt";
		String toPath2 = "E:\\Music\\cats.txt";
		
		FileInPutOutPut textIO = new FileInPutOutPut();
		textIO.copyFile(FromPath2, toPath2);
		assertTrue((new File(toPath2)).exists());
	
		assertEquals(textIO.readTextFromFile(FromPath2),textIO.readTextFromFile(toPath2));

		
	}
}
