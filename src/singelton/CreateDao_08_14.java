package singelton;

public class CreateDao_08_14 {
	
	private static  CreateDao_08_14   createDao_08_14=null;
	
	public static synchronized CreateDao_08_14 getInstance() {
		
		if(createDao_08_14 == null) {
			 createDao_08_14= new CreateDao_08_14();
			
		}
	    return  createDao_08_14;
		
	}

	public static void main(String[] args) {
		
		
		CreateDao_08_14 obj1= new CreateDao_08_14();
		obj1.getInstance();
		System.out.println(obj1.getInstance().hashCode());
		CreateDao_08_14 obj2= new CreateDao_08_14();
		System.out.println(obj2.getInstance().hashCode());
		CreateDao_08_14 obj3= new CreateDao_08_14();
		System.out.println(obj3.getInstance().hashCode());
		CreateDao_08_14 obj4= new CreateDao_08_14();
		System.out.println(obj4.getInstance().hashCode());
		

	}

}
