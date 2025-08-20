package singelton;

public class Create_Dao_19_08 {
	
	private static Create_Dao_19_08 create_Dao_19_08=null;
	
	private static Create_Dao_19_08 getInstance() {
		
			if(create_Dao_19_08 == null) {
				create_Dao_19_08 = new Create_Dao_19_08();
			}
			
		
		
		return create_Dao_19_08;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Create_Dao_19_08 obj1= new Create_Dao_19_08().getInstance();
System.out.println(obj1.hashCode());
Create_Dao_19_08 obj2= new Create_Dao_19_08().getInstance();
System.out.println(obj2.hashCode());

	}

}
