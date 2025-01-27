package singelton;

public class CreateDao_02_27 {
	
public static CreateDao_02_27 createDao_02_27= null;


public CreateDao_02_27 getInstance() {
	
	if(createDao_02_27 == null) {
		createDao_02_27 = new CreateDao_02_27();
	}
	return createDao_02_27;
}
	

	public static void main(String[] args) {
		
		CreateDao_02_27 obj1= new CreateDao_02_27().getInstance();
		
		System.out.println(obj1.hashCode());
		CreateDao_02_27 obj2= new CreateDao_02_27().getInstance();
		System.out.println(obj2.hashCode());
		
		// TODO Auto-generated method stub

	}

}
