package abstracT;

public class singelton {
	
	private static singelton sing=null;
	
	
	private singelton() {
		
	}
	
	private synchronized singelton getInstance() {
		if(sing==null) {
			sing=new singelton();
		}
		return sing;
	}

	public static void main(String[] args) {
		
		
		singelton ob1= new singelton().getInstance();
		System.out.println(ob1.hashCode());
		
		singelton obj2= new singelton().getInstance();
		System.out.println(obj2.hashCode());
		
		// TODO Auto-generated method stub

	}

}
