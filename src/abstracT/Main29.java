package abstracT;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Compression;

public class Main29 {
	

//current stock
//{
//  "P1": {"W1": 100, "W2": 50},
//  "P2": {"W1": 200}
//}
//
//List.of(   new InventoryLog("P1", "W1", -... by Ramadhasan V
//Ramadhasan V
//10:23 AM
//
//List.of(
//  new InventoryLog("P1", "W1", -30),
//  new InventoryLog("P1", "W2", -60),
//  new InventoryLog("P2", "W1", 50),
//  new InventoryLog("P3", "W1", 20)
//)
//
//Output - updated stock {   "P1": {"W1":... by Ramadhasan V
//Ramadhasan V
//10:24 AM
//
//Output - updated stock
//{
//  "P1": {"W1": 70, "W2": -10},
//  "P2": {"W1": 250},
//  "P3": {"W1": 20}
//}



	public static void main(String[] args) {
		
		

//current stock
//{
//  "P1": {"W1": 100, "W2": 50},
//  "P2": {"W1": 200}
//}
		
	Map<String, Map<String, Integer>> currentStock=new HashMap<>();
	
	currentStock.put("p1", new HashMap(Map.of("W1", 100)));
	currentStock.put("p1", new HashMap(Map.of("W2", 50)));
	currentStock.put("p2", new HashMap(Map.of("W1", 200)));
	
	Stock s=new Stock();
	
	
	
	
	List<Stock> log = List.of(
	new Stock("P1", "W1", -30),
	new Stock("P1", "W2", -60),
	new Stock("P2", "W1", 50),
	new Stock("P3", "W1", 20)
	);
	
	for(int i=0;i<log.size();i++) {
		for(Map.Entry<String, Map<String, Integer>> id:currentStock.entrySet() ) {
			System.out.println();
			
			if(log.get(i).equals(id.getKey())) {
				
//				for(Map.Entry<String, Integer> iner:id.getValue().entrySet()) {
//					
//					if(iner.getKey().equals())
//				}
				
				
			}
			
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Name Dept Score
//
//	A Engineering 80
//
//	B Engineering 96
//
//	C HR 79
//
//	D HR 91
//
//	E Finance 91
//
//	F Finance 91
	
	score s1=new score();
	
	
	List<score> of = List.of(new score("A",80),
		   new score("B",96),
		   new score("C",79),
		   new score("D",91),
		   new score("E",91),
		   new score("F",91)
			);
	
	of.stream().collect(Collectors.groupingBy(score :: getDept), Collectors.maxBy(Comparator(score :: getMarks)));
	
	
	


}



	}


