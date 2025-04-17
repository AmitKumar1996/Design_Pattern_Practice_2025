package singelton;

public class CreateDao {
	
	private static CreateDao createDao=null;
	
	private static synchronized CreateDao getInstance() {
	  if(createDao == null) {
		  createDao= new CreateDao();
	  }
	  return createDao;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateDao obj1= new CreateDao().getInstance();
		System.out.println(obj1.hashCode());
		CreateDao obj2= new CreateDao().getInstance();
		System.out.println(obj2.hashCode());

	}

}

/*

4X4
A B

1  0 0  0
0  1  1 1
0  0  1 0
0  0  0 1

rowCheck(){
fo
 
}




*/


