package creation.singleton.apps;

import creation.single.domains.RequestHandler;

public class SingletonClient {
	
	public static void main(String arg[])
	{
		/*RequestHandler handler1 = RequestHandler.getInstance();
		
		System.out.println(handler1.hashCode());
		
		RequestHandler handler2 = RequestHandler.getInstance();
		
		System.out.println(handler2.hashCode());
		
		System.out.println(handler1.equals(handler2));*/
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				RequestHandler handler = RequestHandler.getInstance();
				
				System.out.println(Thread.currentThread().getName()+" "+handler.hashCode());
				
			}
		};
		
		Thread t1 = new Thread(runnable, "Ash");
		Thread t2 = new Thread(runnable, "Bash");
		Thread t3 = new Thread(runnable, "Clash");
		t1.start();
		t2.start();
		t3.start();
	}
}
