package Threads;

public class FirstThread extends Thread {
	
	public void run()
	{
	for (int i=1;i<=5;i++)
	{
		System.out.println("first thread "+i);
	}
	
	try {
		Thread.sleep(5500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	
	
	
}
