package singelton;

public class CreateDao_07_04_2025 {
	private static CreateDao_07_04_2025 ceCreateDao_07_04_2025=null;
	
	private static CreateDao_07_04_2025 getInstance() {
		
		if(ceCreateDao_07_04_2025 == null) {
			ceCreateDao_07_04_2025 = new CreateDao_07_04_2025();
		}
		return ceCreateDao_07_04_2025;
		
	}
   public static void main(String[] args) {
	   CreateDao_07_04_2025 obj1= new CreateDao_07_04_2025().getInstance();
	   System.out.println(obj1.hashCode());
	   CreateDao_07_04_2025 obj2= new CreateDao_07_04_2025().getInstance();
	   System.out.println(obj2.hashCode());
   }

}
