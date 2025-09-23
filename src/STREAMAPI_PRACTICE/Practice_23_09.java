package STREAMAPI_PRACTICE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import java.util.*;

public class Practice_23_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> arrayList = new ArrayList<>();
		
		     arrayList.stream().sorted((s1,s2)->{
		    	 return  s1.subString(1).comareTo(s2.Substring(1));
		     }).forEach(i->System.out.println(i));

	}

}
