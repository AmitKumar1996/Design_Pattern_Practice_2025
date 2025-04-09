package Java_8.StreemAPI.mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<customer> customers=EkartDataBase.getAll();

  



//List<Customer>  convert List<String> -> Data Transformation
//mapping : customer -> customer.getEmail()
//customer -> customer.getEmail()  one to one mapping
         List<String> emails=  customers.stream().map(c->c.getEmail()).collect(Collectors.toList());
         System.out.println(emails);
         
       //customer -> customer.getPhoneNumbers()  ->> one to many mapping
         //customer -> customer.getPhoneNumbers()  ->> one to many mapping   
         
         
    List<List<Long>> phoneNumbers= customers.stream().map(p->p.getPhone()).collect(Collectors.toList());
    
    System.out.println(phoneNumbers);
    
    
    
    //List<Customer>  convert List<String> -> Data Transformation
    //mapping : customer -> phone Numbers
    //customer -> customer.getPhoneNumbers()  ->> one to many mapping
    
   List<Long> phone= customers.stream().flatMap(ph->ph.getPhone().stream()).collect(Collectors.toList());
   
   System.out.println(phone);


	}

}
