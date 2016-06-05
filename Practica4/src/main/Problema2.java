package main;

public class Problema2 {
	
	Thread[] _threads;
	int _n;
	static int _val;
	static Almacen _alm;
	
	public Problema2(){
		_n = 101;
		_val = 0;
		_alm = new Almacen();
		
		_threads = new Thread[_n];
		for (int i = 0; i<_n-1; i++){
			_threads[i] = new Productor();
		}
		_threads[_n-1] = new Consumidor();
		
	}
	
	public void run(){
		for (int i = 0; i<_n; i++){
			_threads[i].start();
		}
		for(int i = 0; i<_n; i++){
			try {
				_threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Problema 2 done, Val = " + _val);
	}

}
