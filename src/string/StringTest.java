package string;

import java.util.ArrayList;
import java.util.Optional;

import declarationAndAccessModifier.pkg.staticImport;


public class StringTest {
	

//String sentence="Take a right for a quick exit";



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = new String("5");
        System.out.println(1 + 10 + s + 1 + 10);
        
        
        /*
         🔍 Expression Analysis:
            1 + 10 = 11 → Both are integers, so simple addition.

            11 + s → s is a String, so now 11 + "5" becomes "115" (number + string → string concatenation).

            "115" + 1 → "1151" (string + number = string).

            "1151" + 10 → "115110". 
         
         
         * */
        // If a null value is passed to a switch statement, it results in a NullPointerException.
//        String str = null;
//        switch (str) { // #1
//            case "null":
//                System.out.println("null string"); // #2
//                break;
//        }
        
        // Line 2 will print null because the println() method has a null check like below.
//        String s1 = null;
//        System.out.println(s1); //line 2
//        System.out.println(s1.toString()); //line 3
        
        
        //We know that the intern() method will return the String object reference from the string pool since we assign it back to s2 and now both s1 and s2 are having the same reference.
        //It means that s1 and s2 references point to the same object.
        String s1 = "hello";
        String s2 = new String("hello");

        s2 = s2.intern();
        System.out.println(s1 == s2);
        
        // It will print false because s2 is not of type String. If you will look at the equals method implementation in the String class, 
        // you will find a check using instanceof operator to check if the type of passed object is String? If not, then return false.
        String a = "abc";
        StringBuffer b = new StringBuffer(a);
        System.out.println(a.equals(b));
         
        // the first two print statements print true. The third print statement prints false because toString() uses a method to compute the value and it is not from the string pool.
        // The final print statement again prints true because equals() looks at the values of String objects.
        
        String s11 = "Java";
        String s22 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s11 == s22);
        System.out.println(s11.equals(s22));
        System.out.println(sb1.toString() == s11);
        System.out.println(sb1.toString().equals(s11));
        
        /*
         
Q11. What happens when two String objects are concatenated using the + operator in Java? 
a) A new String object is created.(Right)
b) The first String object is modified.
c) The second String object is modified.
d) The original String objects remain unchanged.
         */
        
        String str = "Java";
        str.concat(" Programming");
        System.out.println(str);
        
        /*
        
        | Method         | Purpose                                                 |
        | -------------- | ------------------------------------------------------- |
        | **`equals()`** | ✔ Compares **contents** of two strings for **equality** |
        | `compareTo()`  | Compares **lexicographically** and returns an int       |
        | `contains()`   | Checks if a string **contains a specific sequence**     |
        | `concat()`     | Joins two strings (**concatenation**)                   |
        
        */

        
		

     String sentence="Take a right for a quick exit";
     
     //o/p:-  g
     
     
     ArrayList<String> list=new ArrayList<>();
     
    for(int i=0;i<sentence.length();i++) {
    // list.add(sentence.charAt(i));
     
    }
    
    System.out.println(list);
     
     
     
     
     
    System.out.println(list.size());
     
     
     //Character any = list.stream().filter(s -> s.equals(list)).findAny();
     
    // System.out.println(any);
     
     
     


		
	}

}
