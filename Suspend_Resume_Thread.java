package JavaPack;

class NewThread implements Runnable{
	String name;
	Thread t;

	NewThread(String tname){
		name = tname;
		t = new Thread(this,name);
		System.out.println("New Thread: "+t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i = 6; i>0; i--) {
				System.out.println(name+":"+i);
				Thread.sleep(200);
			}
		} catch(InterruptedException e) {
			System.out.println(name+"existing");
		}
	}

public class javapack_suspend_resume_thread {

	public static void main(String[] args) {
		NewThread n1 = new NewThread("One");
		NewThread n2 = new NewThread("Two");
		
		try {
			Thread.sleep(1000);
			n1.t.suspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			n1.t.resume();
			System.out.println("Resuming thread One");
			n2.t.suspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			n2.t.resume();
			System.out.println("Resuming thread Two");
			}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		try {
			System.out.println("Waiting for threads to finish");
			n1.t.join();
			n2.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting");
	}
	}

}
