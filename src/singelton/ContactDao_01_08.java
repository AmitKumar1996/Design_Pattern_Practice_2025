package singelton;

import java.util.*;

public class ContactDao_01_08 {

	private static ContactDao_01_08 contactDao = null;

	public static ContactDao_01_08 getInstance() {

		if (contactDao == null) {

			contactDao = new ContactDao_01_08();
		}
		return contactDao;

	}

	public static void main(String[] args) {

		ContactDao_01_08 obj1 = new ContactDao_01_08().getInstance();

		System.out.println(obj1.hashCode());

		ContactDao_01_08 obj2 = new ContactDao_01_08().getInstance();

		System.out.println(obj2.hashCode());

	}

}
