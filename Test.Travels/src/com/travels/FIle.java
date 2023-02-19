package com.travels;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIle {
	
	public static void LogoDisplay() throws FileNotFoundException{
		FileReader file = new FileReader("C:\\Users\\uday kiran\\Desktop/miniFile.txt");

		try {
			int s;
			while ((s = file.read()) != -1) {
                System.out.print((char)s);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
