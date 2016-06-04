package main;

public class Problema1 {
	
	boolean _lock;
	static int _var;
	Thread[] _threads;
	int _n;
	
	public Problema1(int n){
		_n = n;
		_lock = false;
		_threads = new Thread[n];
		for (int i = 0; i<n/2; i++){
			_threads[i] = new Incrementador(_lock,1000);
		}
		for (int i = 0; i<n/2; i++){
			_threads[i+n/2] = new Decrementador(_lock,1000);
		}
	}
	
	public void Run(){
		for (int i = 0; i<_n; i++){
			_threads[i].run();
		}
		for (int i = 0; i<_n; i++){
			try {
				_threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All done! Var = " + _var);
	}

}
