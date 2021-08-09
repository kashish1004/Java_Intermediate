package com.phoenix.exceptions.main;
/*
 * @author kashish.jain@stltech.in
 * @creation date 13-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.io.IOException;


public class ExceptionDemo {
	//throws demonstration
	public void Amethod() throws IOException {// throws is used when we don't want to catch the exception here but to catch it when it is called by caller.
		int a = 10/0;
		System.out.println("Result is: " + a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		ExceptionDemo d = new ExceptionDemo();
		
		//multicatch and finally demonstration
		try {
			d.Amethod(); //caller needs to handle the exception so written in try catch block
		}catch (IllegalArgumentException | IOException e){//multicatch - there shouldn't be any hierarchy b/w exceptions in this
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally always executes");
		}
		
		//throw demonstration
		try {
			int div = 0;
			if(div == 0)
				throw new ArithmeticException("can't divide by 0");//after throw nothing will be executed in try block so don't write anything
			else {
				int res = 10/div;
				System.out.println("Result is :"+ res);
			}
		}catch(ArithmeticException e){
			e.printStackTrace();
		}	
		
		//try with resources -- it automatically closes the non-java resources (demo in JDBC project in com.phoenix.sql.orcl
		System.out.println("End of main");
	}
}
