package abstracT.Enum.code.strategy;

import java.util.Comparator;

import abstracT.Enum.code.model.product;

public class CategoryComparator implements Comparator<product> {

	
	
	public int compare(product p1, product p2) {
		
		
		// TODO Auto-generated method stub
		return -p2.getCategory().compareTo(p1.getCategory());
	}


}
