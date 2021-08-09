package com.phoenix.comparators;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductBrandComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
