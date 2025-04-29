package thread;

class MyThread2 extends Thread{
	
	public void run() {
		System.out.println("no arg constructor");
	}
	
//	public void run(int x) {
//		System.out.println("int args constructor");
//	}
	
}

public class Overriding_of_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread2 t=new MyThread2();
		t.start();

	}

}
