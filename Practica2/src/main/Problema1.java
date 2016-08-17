package main;

public class Problema1 {
	
	static boolean _lock;
	volatile static int _var;
	Thread[] _threads;
	int _n;
	
	public Problema1(int n){
		_n = n;
		_lock = true;
		_threads = new Thread[n];
		for (int i = 0; i<n/2; i++){
			_threads[i] = new Incrementador(10);
		}
		for (int i = 0; i<n/2; i++){
			_threads[i+n/2] = new Decrementador(10);
		}
	}
	
	public void Run(){
		for (int i = 0; i<_n; i++){
			_threads[i].start();
			System.out.println("Thread " + i + " initiated!");
		}
		for (Thread thread : _threads){
			try {
				thread.join();
				System.out.println("Thread joint!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All done! Var = " + _var);
	}

}
