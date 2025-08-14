package LLD.SOLID.LSP_SOLUTION_DEMO;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		playWithRectangle(new Rectangle(5, 10));
		playWithRectangle(new Squre(10));

	}
	static void playWithRectangle(Rectangle r) {
		
		int area = r.getArea();
		System.out.println(area);
	}

}
