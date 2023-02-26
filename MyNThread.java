package multithreading;

public class MyNThread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("otherthread:"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread();
		
		t1.start();
		
	
	}
}
