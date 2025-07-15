package singelton;

public class CrateDao_01_08_2 {

	private static CrateDao_01_08_2 crateDao_01_08_2;

	private static CrateDao_01_08_2 getInstance() {
		synchronized (crateDao_01_08_2) {
			if (crateDao_01_08_2 == null) {

				crateDao_01_08_2 = new CrateDao_01_08_2();
			}
			return crateDao_01_08_2;
			
		}
		
	}

	public static void main(String[] args) {

		CrateDao_01_08_2 obj1 = new CrateDao_01_08_2().getInstance();

		System.out.println(obj1.hashCode());

		CrateDao_01_08_2 obj2 = new CrateDao_01_08_2().getInstance();

		System.out.println(obj2.hashCode());
		// TODO Auto-generated method stub

	}

}
