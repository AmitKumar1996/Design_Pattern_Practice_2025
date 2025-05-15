package abstracT.Enum.code;

import java.util.List;

import abstracT.Enum.code.model.product;
import abstracT.Enum.code.service.Invontary;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Invontary invontary = new Invontary();
		
		invontary.initlizedProducts();
		
		List<product> productSortedByCategoryDes = invontary.getProductSortedByCategoryDes();
		
		invontary.displayProduct(productSortedByCategoryDes);
		
		
	}

}
