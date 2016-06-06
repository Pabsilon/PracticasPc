package main;

public class Problema3 {
	
	Thread[] _threads;
	static AlmacenMultiV1 _alm;
	static int _val;
	
	public Problema3(){
		_alm = new AlmacenMultiV1(10);
		_val = 0;
		_threads = new Thread[7];
		
		_threads[0] = new ConsumidorMulti();
		for (int i = 1; i<7; i++){
			_threads[i] = new ProductorMulti();
		}
		
	}
	
	public void run(){
		for (int i = 0; i<7; i++){
			_threads[i].start();
		}
		for (int i = 0; i<7; i++){
			try {
				_threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Problema 3 hecho: Val = " + _val);
	}
}
