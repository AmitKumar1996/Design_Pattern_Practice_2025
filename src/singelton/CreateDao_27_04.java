package singelton;

public class CreateDao_27_04 {
	
	
	private static CreateDao_27_04 createDao_27_04=null;
	
	private CreateDao_27_04() {
		
	}

	
	private static synchronized CreateDao_27_04  getInstance() {
		if(createDao_27_04==null) {
			createDao_27_04=new CreateDao_27_04();
		}
		return createDao_27_04;
	}

	public static void main(String[] args) {
		
		CreateDao_27_04 o1= new CreateDao_27_04().getInstance();
		
		CreateDao_27_04 o2= new CreateDao_27_04().getInstance();
		
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		// TODO Auto-generated method stub

	}

}
