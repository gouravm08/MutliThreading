package threading;


class Test extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running thread "+Thread.currentThread().getName() );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class TestRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Running thread using Interface "+Thread.currentThread().getName() );
		}
	}
}

public class MyThreading {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getState());
//		TestRunnable runnable=new TestRunnable();
//		Thread thread=new Thread(runnable);
//		thread.start();
		try {
			Thread.sleep(10000);
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getState());
	}

}
