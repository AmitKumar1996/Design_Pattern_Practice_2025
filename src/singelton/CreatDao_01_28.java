package singelton;

public class CreatDao_01_28 {
	
	private static CreatDao_01_28 creatDao_01_28=null;
	
	private static CreatDao_01_28 getInstance() {
		
		if(creatDao_01_28 == null) {
			creatDao_01_28 = new CreatDao_01_28();
		}
		return creatDao_01_28;
	}

	public static void main(String[] args) {
		
		CreatDao_01_28 obj1= new CreatDao_01_28().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreatDao_01_28 obj2= new CreatDao_01_28().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
