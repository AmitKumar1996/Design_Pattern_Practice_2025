package LLD.SOLID.LSP_VOLITATION_DEMO;

public class Rectangle {
	int height;
	int width;
	
	void setHeight(int ht) {
		height=ht;
	}
	void SetWidth(int w) {
		width=w;
	}
	
	int getArea() {
		return height * width;
	}

}
