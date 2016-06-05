package main;

public class Problema {
	
	int _n;
	Thread[] _threads;
	static int _var;
	
	
	public Problema(int n){
		_n = n;
		_threads = new Thread[n];
		_var = 0;
		
		for (int i = 0; i<n/2; i++){
			_threads[i] = new Incrementador(1000);
		}
		for (int i = 0; i<n/2; i++){
			_threads[i+n/2] = new Decrementador(1000);
		}
	}
	
	static synchronized void aumenta(int n){
		_var = _var + n;
	}
	
	static synchronized void disminuye(int n){
		_var = _var - n;
	}
	
	public void run(){
		for (int i = 0; i<_n; i++){
			_threads[i].start();
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
