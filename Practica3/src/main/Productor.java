package main;

import java.util.concurrent.Semaphore;

public class Productor extends Thread{
	
	Semaphore _sem;

	public Productor(Semaphore sem){
		_sem = sem;
	}
	
	public void run(){
		try {
			_sem.acquire();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (Problema2._alm.status()){
			_sem.release();
			this.run();
		}else{
			Problema2._alm.almacenar();
			_sem.release();
		}
	}
	
}
