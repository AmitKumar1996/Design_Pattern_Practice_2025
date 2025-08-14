package LLD.SOLID.LSP_SOLUTION_DEMO;

public class Rectangle {
	int height;
	int width;
	
	public  Rectangle(int h, int w) {
		height=h;
		width=w;
		
	}
	
	int getArea() {
		return height * width;
	}

}
