package Accenture.dsajava;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        List<Shipment> shipments = new ArrayList<>();

        shipments.add(new Shipment("S1", "LosAngeles", 3));
        shipments.add(new Shipment("S2", "NewYork", 2));
        shipments.add(new Shipment("S3", "Boston", 1));
        
       
        shipments.add(new Shipment("S51", "Chicago", 2));
        shipments.add(new Shipment("S-51", "Chicago", 2));
        

        IShipmentSorter sorter = new ShipmentSorter();
        List<Shipment> sorted = sorter.sortShipments(shipments);

        for (Shipment s : sorted) {
            System.out.println(s);
        }
    }
}


/*
 
 
 🔹 Question ka Simple Meaning

Tumhe e-commerce logistics company ke liye ek sorting system banana hai.

Company ke paas shipments hain, aur har shipment ke paas:

ID

Destination city

Delivery me kitne din baaki hain (daysLeft)

Tumhara kaam:
👉 Shipments ko sort karna.

🔹 Sorting Rule (Sabse Important)
🔸 Rule 1 (Primary)

Jis shipment ke delivery ke din kam hain, wo pehle aayega

👉 daysLeft ascending order

🔸 Rule 2 (Secondary)

Agar do shipments ka daysLeft same ho
→ unko city ke naam ke alphabetical order me arrange karo

👉 city A → Z
 
 
 
 
 
 
 
 
 
 */