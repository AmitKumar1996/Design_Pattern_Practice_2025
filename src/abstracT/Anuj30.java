package abstracT;

import java.util.ArrayList;
import java.util.List;

public class Anuj30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="123567!1234@8790";
		
		char[] ch=s.toCharArray();

		int ptr=0;
		
		String ans="";
		
		List<String> list= new ArrayList<String>();
		
		while(ptr<ch.length) {
			
			if(ptr==ch.length-1) {
				if(ch[ptr-1]+1==ch[ptr]) {
					ans+=ch[ptr];
					list.add(ans);
					ans="";
				}
				else {
					ans+=ch[ptr];
					list.add(ans);
				}
			}
			
			if(ch[ptr]+1==ch[ptr+1]) {
				ans+=ch[ptr++];
			
			}else {
				ans+=ch[ptr++];
				list.add(ans);
				ans="";
				
				
			}
			
		}
		
		System.out.println(list);
	}

}
