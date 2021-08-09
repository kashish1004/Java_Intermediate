package com.phoenix.collections.list;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.phoenix.comparators.ProductBrandComparator;
import com.phoenix.comparators.ProductNameComparator;
import com.phoenix.models.Product;

public class ProductListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1002, "Mobile", "Samsung", 23500.00f));
		productList.add(new Product(1005, "Laptop", "Lenovo", 28700.00f));
		productList.add(new Product(1006, "Refrigerator", "Whirlpool", 39800.00f));
		productList.add(new Product(1001, "UHD TV", "Sony", 79999.00f));
		productList.add(new Product(1002, "Mobile", "Samsung", 23500.00f));
		
		System.out.println("Before Sorting");
		for(Product pro:productList)
			System.out.println(pro);
		
		Collections.sort(productList);
		
		System.out.println("Sorting acc. to id asc");
		for(Product pro:productList)
			System.out.println(pro);
		
		System.out.println("Sorting acc. to id desc");
		Collections.sort(productList,Collections.reverseOrder());
		for(Product pro:productList)
			System.out.println(pro);
		
		System.out.println("Sorting acc. to name asc");
		Collections.sort(productList, new ProductNameComparator());
		for(Product pro:productList)
			System.out.println(pro);
		
		System.out.println("Sorting acc. to name desc");
		Collections.sort(productList, new ProductNameComparator().reversed());
		for(Product pro:productList)
			System.out.println(pro);
		
		System.out.println("Sorting acc. to brand asc");
		Collections.sort(productList, new ProductBrandComparator());
		for(Product pro:productList)
			System.out.println(pro);
		
		System.out.println("Sorting acc. to brand desc");
		Collections.sort(productList, new ProductBrandComparator().reversed());
		for(Product pro:productList)
			System.out.println(pro);
		
	}

}
