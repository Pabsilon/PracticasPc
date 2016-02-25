package main;

public class Problem1 {
	
	Runnable _threads[];
	int _n;
	
	public Problem1(int n){
		_threads = new Thread[n];
		_n = n;
		for (int i = 0; i<_n; i++){
			_threads[i]=new Problem1run(i);
		}
	}
	
	public void Run(){
		for(int i = 0; i<_n; i++){
			((Thread) _threads[i]).start();
		}
		for (int i = 0; i<_n; i++){
			try {
				((Thread) _threads[i]).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All done!");
	}
	
	
}
