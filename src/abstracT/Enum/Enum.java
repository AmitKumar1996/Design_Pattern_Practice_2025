package abstracT.Enum;

public class Enum {
	enum status{  // this is class
		runing, wating, sleap, failed, sucess   // these are object
	}
	

	public static void main(String[] args) {
		
		Enum obj=new Enum();
		status s = status.runing;
		
		             status[] values = status.values();
		             
		           for(status i: values)
		             System.out.println(i.toString());
		
		
		System.out.println(s.ordinal());
		
		
		
		// TODO Auto-generated method stub

	}

}
