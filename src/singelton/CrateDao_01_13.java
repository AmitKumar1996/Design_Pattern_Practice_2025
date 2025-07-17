package singelton;

public class CrateDao_01_13 {
	
	private static CrateDao_01_13 crateDao_01_13=null;
	
	private static synchronized CrateDao_01_13 getInstance() {
		
		if(crateDao_01_13 == null) {
			  crateDao_01_13= new  CrateDao_01_13();
				
			}
			return crateDao_01_13;
	}
	
	

	public static void main(String[] args) {
		
		CrateDao_01_13 obj1= new CrateDao_01_13().getInstance();
		System.out.println(obj1.hashCode());
		
		
		CrateDao_01_13 obj2 = new CrateDao_01_13().getInstance();
		System.out.println(obj2.hashCode());
		
		
	

	}

}
