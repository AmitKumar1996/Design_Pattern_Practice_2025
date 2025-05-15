package abstracT.Enum.code.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import abstracT.Enum.code.factory.productFactory;
import abstracT.Enum.code.model.product;
import abstracT.Enum.code.strategy.CategoryComparator;

public class Invontary {
	
	private final List<product> products= new ArrayList<product>();
	
	public void initlizedProducts() {
		String[] types= {"Book", "Computer","iPad"};
		
		Random random=new Random();
		
		for(int i=0;i<100;i++) {
			String type = types[random.nextInt(types.length)];
			products.add(productFactory.createProduct(type, type+" "+i));
		}
		
	}
	
	public List<product> getProductSortedByCategoryDes() {
		
		return products.stream().sorted(new CategoryComparator()).collect(Collectors.toList());
		
	}
	
	public void displayProduct(List<product> productsList) {
		
		productsList.forEach(System.out::println);
		
		
		
	}

}
