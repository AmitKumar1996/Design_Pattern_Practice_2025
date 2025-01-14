package singelton;

public class CreatDao_01_14 {
	
	
	private static  CreatDao_01_14 ceCreatDao_01_14=null;
	
	private CreatDao_01_14 getInstance() {
		if(ceCreatDao_01_14 == null) {
			ceCreatDao_01_14 = new CreatDao_01_14();
		}
		return ceCreatDao_01_14;
	}

	public static void main(String[] args) {
		
		CreatDao_01_14 obj1= new CreatDao_01_14().getInstance();
		System.out.println(obj1.hashCode());
		
		CreatDao_01_14 obj2= new CreatDao_01_14().getInstance();
		
		System.out.println(obj2.hashCode());
		
		CreatDao_01_14 obj3 = new CreatDao_01_14().getInstance();
		System.out.println(obj3.hashCode());

	}

}
