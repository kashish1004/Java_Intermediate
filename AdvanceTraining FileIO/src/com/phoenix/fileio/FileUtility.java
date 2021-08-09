package com.phoenix.fileio;

import java.io.File;
import java.io.IOException;

/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			File file = new File("hello.txt");
			//System.out.println("File Created: " + file.createNewFile());

			File dir = new File("MyDir");
			//System.out.println("Directory Created: " + dir.mkdir());

			File f1 = new File(dir, "Hello.txt");
			System.out.println("File Created: " + f1.createNewFile());

			File f2 = new File(dir, "Welcome.txt");
			System.out.println("Renaming file " + file.getName() + " to " + f2.getName() + ": " + file.renameTo(f2));

			File f3 = new File("Welcome.txt");
			System.out.println("Deleting file: " + f3.delete());			 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
