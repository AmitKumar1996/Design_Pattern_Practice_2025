package LLD.SOLID.LSP_VOLITATION_DEMO;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		playWithRectangle(new Rectangle());
		playWithRectangle(new Squre());

	}
	static void playWithRectangle(Rectangle r) {
		r.setHeight(10);
		r.SetWidth(5);
		int area = r.getArea();
		System.out.println(area);
	}

}
