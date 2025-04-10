package abstracT;

public class string1 {
	
	private static string1 str=null;
	
	private static string1 getInstance() {
		if(str==null) {
			str=new string1();
		}
		return str;
	}

	public static void main(String[] args) {
		
		string1 obj1=new string1().getInstance();
		System.out.println(obj1.hashCode());
		string1 obj2=new string1().getInstance();
		System.out.println(obj2.hashCode());
		
		

	}

}
