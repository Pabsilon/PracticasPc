package main;

import java.util.concurrent.Semaphore;

public class Problema2 {
	
	Thread[] _productores;
	static Almacen _alm;
	static int _val;
	
	Semaphore _sem;

	public Problema2(){
		_val = 0;
		_alm = new Almacen();
		_productores = new Thread[11];
		_sem = new Semaphore(1);
		for (int i =0; i<10; i++){
			_productores[i] = new Productor(_sem);
		}
		_productores[10] = new Consumidor(_sem);
	}
	
	public void run(){
		for (int i = 0; i<11; i++){
			_productores[i].start();
		}
		for (int i = 0; i<11; i++){
			try {
				_productores[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Problema 2 done, Var = " + _val);
	}
	
}