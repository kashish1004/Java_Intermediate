package com.phoenix.comparators;
/*
 * @author kashish.jain@stltech.in
 * @creation date 14-Jul-2021
 * @version - 2.0
 * @Copyright Sterlite Technologies Ltd
 */
import java.util.Comparator;

import com.phoenix.models.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice()>o2.getPrice())
			return 1;
		else if(o1.getPrice()<o2.getPrice())
			return -1;
		return 0;
	}

}
