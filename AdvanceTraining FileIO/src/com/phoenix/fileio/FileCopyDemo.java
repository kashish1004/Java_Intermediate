package com.phoenix.fileio;
/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try( FileInputStream fis = new FileInputStream("hello.txt"); 
			 FileOutputStream fos = new FileOutputStream("data.txt",true);	
				)
		{
			//file copying logic
			int data = 0;
			while((data = fis.read())!=-1)
				fos.write(data);
			
			System.out.println("Data is copied successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
