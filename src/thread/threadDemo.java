package thread;


class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Amit Thread"+i);
		}
	}

//for(int i=0;i<10;i++) {
//System.out.println("Amit Thread"+i);
//}

	
}

public class threadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t=new MyThread();
		//t.start(); // created new thread every time 
		t.run();  // this is normal method by main thread
		
		for(int i=5;i>0;i--) {
			System.out.println("This is my Thread2:- "+i);
		}

	}

}
