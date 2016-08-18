package main;

import java.util.concurrent.Semaphore;

public class Productor extends Thread{
	
	Semaphore _sem;

	public Productor(Semaphore sem){
		_sem = sem;
	}
	
	public void run(){
		while (Problema2._val<40){
			try {
				_sem.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (!Problema2._alm.status()){
				Problema2._alm.almacenar();
				System.out.println("He almacenado!");
				_sem.release();
			}else{
				_sem.release();
				
			}
			
		}
	}
	
}
