package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void garbageCreating() throws IOException {
		String filename = "src\\\\hust\\\\soict\\\\dsai\\\\garbage\\\\test.txt"; // test.exe is the name or path to the file
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
		    outputString += (char)b;
		}
		endTime = System.currentTimeMillis();
		System.out.println("Time for using concat string normally: "+(endTime - startTime));
	}
}
