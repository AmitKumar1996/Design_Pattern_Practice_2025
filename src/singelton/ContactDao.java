package singelton;
import java.util.*;

public class ContactDao {
	
	private static ContactDao contactDao=null;
	
	private static ContactDao getInstance() {
		if(contactDao == null) {
			contactDao=new ContactDao();
		}
		return contactDao;
		
	}
	
	public static void main(String[] args) {
		
		ContactDao obj1=new ContactDao().getInstance();
		
		System.out.println(obj1.hashCode());
		
		ContactDao obj2= new  ContactDao().getInstance();
		
		System.out.println(obj2.hashCode());
	}

}
