package main;

import java.util.concurrent.Semaphore;

public class Consumidor extends Thread{
	
	Semaphore _sem;

	public Consumidor (Semaphore sem){
		_sem = sem;
	}
	
	public void run(){
		while (Problema2._val<10){
			try {
				_sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (Problema2._alm.status()){
				Problema2._alm.extraer();
				Problema2._val = Problema2._val + 1;
				_sem.release();
			}else{
				_sem.release();
			}
		}
	}
	
}
