package com.phoenix.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.phoenix.models.Product;

/*
 * @author kashish.jain@stltech.in
 * @creation date 16-Jul-2021
 * @version - 1.0
 * @Copyright Sterlite Technologies Ltd
 */
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> proList = new ArrayList<Product>();
		proList.add(new Product(101, "Laptop", "Acer", 50000.0f));
		proList.add(new Product(102, "Laptop", "HP", 45000.0f));
		proList.add(new Product(103, "Mobile", "Samsung", 15000.0f));
		proList.add(new Product(104, "LED TV", "Sony", 57000.0f));
		proList.add(new Product(105, "Refrigerator", "Whirlpool", 57000.0f));
		
		/*
		 * Stream<Product> proStream = proList.stream(); Stream<Product> filteredStream
		 * = proStream.filter(p -> p.getPrice() > 30000); List<Product> filteredProList
		 * = filteredStream.collect(Collectors.toList()); filteredProList.forEach(p ->
		 * System.out.println(p)); System.out.println();
		 */
		
		
		//Stream Pipeline
		List<Product> pros = proList.stream().filter(p->p.getPrice()>20000).collect(Collectors.toList());
		pros.forEach(System.out::println);
		
		//use of map
		List<Float> prices =  proList.stream().filter(p->p.getPrice()>20000).map(product->product.getPrice()).collect(Collectors.toList());
		prices.forEach(System.out::println);
		
		long count = proList.stream().filter(p->p.getPrice()>20000).count();
		System.out.println("No of Products in list: "+count);
		
		Product pMaxPrice = proList.stream().max( (p1,p2)->p1.getPrice()>p2.getPrice()?1:-1 ).get();
		System.out.println("Product with max price: "+pMaxPrice);
		
		Product pMinPrice = proList.stream().min( (p1,p2)->p1.getPrice()>p2.getPrice()?1:-1 ).get();
		System.out.println("Product with max price: "+pMinPrice);
		
		float maxPrice = proList.stream().map(p->p.getPrice()).max((price1,price2)->price1>price2?1:-1 ).get();
		System.out.println("maxPrice: "+maxPrice);
		
		float minPrice = proList.stream().map(p->p.getPrice()).min((price1,price2)->price1>price2?1:-1 ).get();
		System.out.println("minPrice: "+minPrice);
		
	}

}
