package main;

public class Problem1run extends Thread{

	int _pid;
	
	public Problem1run(int n){
		_pid = n;
	}
	
	public void run() {
		System.out.println("I am thread number: " + _pid);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("I am thread number: " +_pid);
	}

}
