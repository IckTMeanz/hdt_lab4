package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void garbageAvoiding() throws IOException {
		String filename = "src\\hust\\soict\\dsai\\garbage\\test.txt"; // test.exe is the name or path to the file
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		inputBytes = Files.readAllBytes(Paths.get(filename));
		StringBuilder stringbuider= new StringBuilder();
		startTime = System.currentTimeMillis();
		//String outputString = "";
		for (byte b : inputBytes) {
		    stringbuider.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println("time for using Stringbuilder: "+(endTime - startTime));
	}
}
