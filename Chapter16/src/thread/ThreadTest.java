package thread;

class MyThread implements Runnable{

	

	public void run(){
		
		int i;
		for(i=0; i<200; i++){
			
			System.out.print(i + "\t");
	
		/*	try {
				
				sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("main start");
	/*	
		MyThread th1 = new MyThread();
		th1.start();
		
		MyThread th2 = new MyThread();
		th2.start();
		*/
		
		MyThread mth = new MyThread();
		Thread th1 = new Thread(mth);
		th1.start();
		
		Thread th2 = new Thread(new MyThread());
		th2.start();
		
		System.out.println("main end");
		
		
		
		 Runnable runnable  = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
		
		
		
		
	}

}
