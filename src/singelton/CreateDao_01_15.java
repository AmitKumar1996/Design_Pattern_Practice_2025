package singelton;

public class CreateDao_01_15 {
	
	private static  CreateDao_01_15 createDao_01_15=null;
	
	private static CreateDao_01_15 getInstance() {
		
		synchronized (createDao_01_15) {
			if(createDao_01_15 == null) 
			{
				createDao_01_15 = new CreateDao_01_15();
				
			}
			
		}
		
		
		return createDao_01_15;
	}
	
	
	

	public static void main(String[] args) {
		
		CreateDao_01_15 obj1= new CreateDao_01_15().getInstance();
		System.out.println(obj1.hashCode());
		
		CreateDao_01_15 obj2= new CreateDao_01_15().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub
CreateDao_01_15 obj3= new CreateDao_01_15().getInstance();
		
		System.out.println(obj3.hashCode());
		
CreateDao_01_15 obj4= new CreateDao_01_15().getInstance();
		
		System.out.println(obj4.hashCode());

	}

}
