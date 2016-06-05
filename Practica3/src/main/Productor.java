package main;

import java.util.concurrent.Semaphore;

public class Productor extends Thread{
	
	Semaphore _sem;
	boolean _produced;

	public Productor(Semaphore sem){
		_sem = sem;
		_produced = false;
	}
	
	public void run(){
		while (!_produced){
			try {
				_sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!Problema2._alm.status()){
				Problema2._alm.almacenar();
				_produced = true;
				_sem.release();
			}else{
				_sem.release();
			}
			
		}
	}
	
}
