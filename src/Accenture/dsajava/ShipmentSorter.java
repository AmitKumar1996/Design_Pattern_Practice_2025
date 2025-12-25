package Accenture.dsajava;

import java.util.Comparator;
import java.util.List;

public class ShipmentSorter implements IShipmentSorter {

    public List<Shipment> sortShipments(List<Shipment> shipments) {

       shipments.sort((s1,s2)->{
    	   
    	   
    	   if(s1.getDaysLeft()!=s2.getDaysLeft()) {
    		   return Integer.compare(s1.getDaysLeft(), s2.getDaysLeft());
    	   }
    	   else if(s1.getCity()!=s2.getCity()) {
    	
    	   return s1.getCity().compareTo(s2.getCity());
    	   }
    	   else {
    	   
    	   return s1.getId().compareTo(s2.getId());
    	   }
    	   
       });

        return shipments;
    }
}
