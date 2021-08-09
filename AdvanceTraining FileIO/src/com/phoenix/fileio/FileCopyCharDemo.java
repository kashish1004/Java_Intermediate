package com.phoenix.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("hello.txt");
			FileWriter fw = new FileWriter(new File("data1.txt"),true)
			)
		{
			int data = 0;
			while((data = fr.read())!= -1)
				fw.write(data);
			System.out.println("data is copied successfully");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
