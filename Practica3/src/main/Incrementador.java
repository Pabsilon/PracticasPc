package main;

import java.util.concurrent.Semaphore;

public class Incrementador extends Thread{
	
	Semaphore _sem;
	int _n;
	
	public Incrementador (int n, Semaphore sem){
		_n = n;
		_sem = sem;
	}
	
	public void run(){
		
		for (int i = 0; i<_n; i++){
			try {
				_sem.acquire();;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Problema1._var = Problema1._var +i;
			_sem.release();
		}
		
	}

}
