package abstracT.Enum.code.factory;

import abstracT.Enum.code.model.Book;
import abstracT.Enum.code.model.Computer;
import abstracT.Enum.code.model.iPad;
import abstracT.Enum.code.model.product;

public class productFactory {
	
	
	public static product createProduct(String type, String name) {
		
		return switch(type) {
		case "Book" -> new Book(name);
		
		case "Computer" -> new Computer(name);
		
		case "iPad"  -> new iPad(name);
		
		default -> throw new IllegalArgumentException("Unknown product type:  "+ type);
		};
		

		
	}

}
