package singelton;

public class ClassDao_04_07 {
	
	private static  ClassDao_04_07 creClassDao_04_07= null;
	
	private static ClassDao_04_07 getInstance() {
		
		if(creClassDao_04_07 == null) {
			creClassDao_04_07 = new ClassDao_04_07();
			
		}
		return creClassDao_04_07;
	}
	

	public static void main(String[] args) {
		
		ClassDao_04_07 obj1= new ClassDao_04_07().getInstance();
		System.out.println(obj1.hashCode());
		
		ClassDao_04_07 obj2= new ClassDao_04_07().getInstance();
		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
