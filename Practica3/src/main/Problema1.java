package main;

import java.util.concurrent.Semaphore;

public class Problema1 {

	Thread[] _threads;
	int _n;
	volatile static int _var;
	Semaphore _sem;
	
	public Problema1(int n){
		_sem = new Semaphore(1);
		_n = n;
		_threads = new Thread[n];
		for (int i = 0; i< n/2; i++){
			_threads[i] = new Incrementador(1000, _sem);
		}
		for (int i = 0; i<n/2; i++){
			_threads[i+n/2] = new Decrementador(1000, _sem);
		}
	}
	
	public void run(){
	
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
