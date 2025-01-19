package singelton;

public class CreatDao_01_19 {
	
	private static CreatDao_01_19 creatDao_01_19=null; 
	
	private static CreatDao_01_19 getInstance() {
		if(creatDao_01_19 == null) {
			creatDao_01_19 = new CreatDao_01_19();
		}
		return creatDao_01_19;
	}

	public static void main(String[] args) {
		
		CreatDao_01_19 obj1= new CreatDao_01_19().getInstance();
		
		System.out.println(obj1.hashCode());
		
		CreatDao_01_19 obj2= new CreatDao_01_19().getInstance();
		
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
