package com.phoenix.clones;
/*
 * @author kashish.jain@stltech.in
 * @creation date 19-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
import com.phoenix.dates.Date;
import com.phoenix.models.Product;

public class DeepCloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product(3402, "Laptop", "HP", 45000.0f,new Date(4, 10, 2020));
		System.out.println("Original Product: "+p);
		
		//deep copying
		
		//get the clone of container object
		try {
			Product clonedProd = (Product) p.clone();
			System.out.println("Clone of Product:"+clonedProd);
			
			Date originalMfgDate = p.getMfgDate();
			
			//get the clone of contained object Mfg Date
			Date clonedMfgDate = (Date)originalMfgDate.clone();
			clonedProd.setMfgDate(clonedMfgDate);
			
			clonedProd.getMfgDate().setDd(25);
			
			System.out.println("Cloned Product: "+ clonedProd);
			System.out.println("Original Product: "+p);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
