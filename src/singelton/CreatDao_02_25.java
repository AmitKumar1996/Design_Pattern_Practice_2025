package singelton;

public class CreatDao_02_25 {
	
	private static CreatDao_02_25 creatDao_02_25=null;
	
	private static CreatDao_02_25 getInstance() {
		
		if(creatDao_02_25 == null) {
			creatDao_02_25 = new CreatDao_02_25();
		}
		return creatDao_02_25;
	}

	public static void main(String[] args) {
		
		CreatDao_02_25 obj1= new CreatDao_02_25().getInstance();
		System.out.println(obj1.hashCode());
		
		CreatDao_02_25 obj2= new CreatDao_02_25().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
