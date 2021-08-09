package com.phoenix.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class SerializeProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("productData.txt"));	)
		{
			Product p = new Product(5602, "LED TV", "Sony", 50000.0f,new Date(10, 10, 2020));
			out.writeObject(p);
			System.out.println("product object is serialized");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
