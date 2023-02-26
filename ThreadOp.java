package multithreading;
class UserThread extends ThreadOp{
	public  void run() {
		//task or user thread
		System.out.println("this is user defined thread");
	}


}

public class ThreadOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program started...");
	    
		int x=98;
		int y=78;
		int sum=x+y;
		System.out.println(sum);
		//thread get name
		Thread t=Thread.currentThread();
		String tName=t.getName();
		System.out.println(tName);
		//thread set name
		t.setName("MyMain");
		System.out.println(t.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getId());
		System.out.println("program ended..");
		//this is user defined thread
		UserThread t1=new UserThread();
		t1.run();

	}

}
