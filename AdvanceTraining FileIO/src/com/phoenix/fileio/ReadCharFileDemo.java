package com.phoenix.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class ReadCharFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try( FileReader fr = new FileReader(new File("hello.txt"));)
		{
			int data = 0;
			while((data=fr.read())!= -1)
				System.out.print((char)data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
