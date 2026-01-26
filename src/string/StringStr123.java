package string;

public class StringStr123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("hello");
		String s2="hello";
		String s3= new String("hello");
		String s4="hello";
		
		
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.intern()==s2);

		System.out.println(s2==s4);

	}

}
