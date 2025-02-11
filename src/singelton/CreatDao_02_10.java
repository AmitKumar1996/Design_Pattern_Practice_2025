package singelton;

public class CreatDao_02_10 {
	
	private static CreatDao_02_10 creatDao_02_10=null;
	
	private CreatDao_02_10 getInstance() {
		
		if(creatDao_02_10 == null) {
			creatDao_02_10 = new CreatDao_02_10();
		}
		return creatDao_02_10;
	}

	public static void main(String[] args) {
		CreatDao_02_10 obj1=new CreatDao_02_10().getInstance();
		System.out.println(obj1.hashCode());
		
		CreatDao_02_10 obj2=new CreatDao_02_10().getInstance();
		
	     System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
