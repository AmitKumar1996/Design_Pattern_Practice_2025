package singelton;

public class CreatDao_01_26 {
	
	
	private static CreatDao_01_26 creatDao_01_26=null;
	
	
	public static CreatDao_01_26 getInstance() {
		
		if(creatDao_01_26 == null) {
			
			creatDao_01_26 = new CreatDao_01_26();
		}
		return creatDao_01_26;
	}
	
	
	

	public static void main(String[] args) {
		
		CreatDao_01_26 obj1= new CreatDao_01_26().getInstance();
		
		System.out.println(obj1.hashCode());
		
		
		
		CreatDao_01_26 obj2= new CreatDao_01_26().getInstance();
		
		
		System.out.println(obj2.hashCode());
		
		
		// TODO Auto-generated method stub

	}

}
