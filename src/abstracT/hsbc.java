package abstracT;

import java.util.ArrayList;

public class hsbc {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(10);
		
		
		
		
		// max sum =
		
		int fmax=list.get(0);
		int smax=list.get(1);
		int tmax=list.get(2);
		
		if(fmax<smax) {
			if(tmax>fmax) {
				int temp=fmax;
				fmax=tmax;
				tmax=temp;
				
			}
			
		}
		else if(smax<tmax) {
			int temp=tmax;
			tmax=smax;
			smax=temp;
			
		}
	//	System.out.println("1-> "+fmax+" 2-> "+smax+" 3-> "+tmax);
		
		for(int i=3;i<list.size();i++) {
			
			
			if(fmax <  list.get(i)) {
				
				int temp=fmax;
				fmax=list.get(i);
				tmax=smax;
				smax=temp;
			}else if(smax<list.get(i)) {
				int temp=smax;
				smax=list.get(i);
				tmax=temp;
				
			}
			else if(tmax<list.get(i)){
				tmax=list.get(i);
			}
			
			
			
		}
		
		System.out.println("1-> "+fmax+" 2-> "+smax+" 3-> "+tmax);
		
		int first=fmax+smax;
		int second=fmax+tmax;
		
		System.out.println("First sum :-  "+first);
		System.out.println("Second sum :-  "+second);
		
		
		
	}

}
