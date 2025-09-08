package abstracT;

class  Myclass{
	
	

	private static String name = "";
	
	private static String email="";
	/**
	 * @param string2 
	 * @param string 
	 * 
	 */
	public Myclass(String string, String string2) {
		this.name=string;
		this.email=string2;
		
	}

	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public static String getEmail() {
		return email;
	}

	public Myclass() {
		super();
	}

	
	
	
}

public class test23 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Myclass obj=new Myclass();
//		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
		
		Myclass obj2=new Myclass("Sumit","Kumar@gmail.com");
		
		System.out.println(obj2.getName());
		System.out.println(obj2.getEmail());
		
		
		
		

	}

}
