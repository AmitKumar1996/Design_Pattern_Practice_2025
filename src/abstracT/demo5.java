package abstracT;

import java.util.HashMap;
import java.util.*;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="amit kumar";
		
		String replace = s.replace(" ", "");
		
		s=replace;
		
	

    HashMap<Character, Integer> map=new HashMap<>();



     for(int i=0;i<s.length();i++){

       if(map.containsKey(s.charAt(i))){
    	   
                  map.put(s.charAt(i), map.get(s.charAt(i))+1);

       }
        else{
              map.put(s.charAt(i), 1 );
       }
       
      }


     System.out.println(map);

	}

}
