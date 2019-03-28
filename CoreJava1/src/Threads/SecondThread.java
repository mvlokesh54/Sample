package Threads;

public class SecondThread extends Thread {
	
	public void run()
	{
	for (int i=1;i<=5;i++)
	{
		System.out.println("Second thread "+i);
	}
	
	try {
		Thread.sleep(5500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public static void main(String[] args) {
		
		
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		t1.start();
		t2.start();
		
		//for runnable interface 
		/*Thread th1= new Thread(t1);
		Thread th2= new Thread(t2);
		t1.start();
		t2.start();*/
		
		
		
		
		
	}
	
}
