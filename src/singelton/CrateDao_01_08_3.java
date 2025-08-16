package singelton;

public class CrateDao_01_08_3 {

	private static CrateDao_01_08_3 crateDao_01_08_3 = null;

	private static CrateDao_01_08_3 getInstance() {

	
		
		synchronized(crateDao_01_08_3){
		if (crateDao_01_08_3 == null) {
			crateDao_01_08_3 = new CrateDao_01_08_3();
		}
		return crateDao_01_08_3;
	}}

	public static void main(String[] args) {

		CrateDao_01_08_3 obj1 = new CrateDao_01_08_3().getInstance();
		System.out.println(obj1.hashCode());

		CrateDao_01_08_3 obj2 = new CrateDao_01_08_3().getInstance();
		System.out.println(obj2.hashCode());

	}

}
