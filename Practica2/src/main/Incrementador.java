package main;

public class Incrementador extends Thread{
	
	boolean _lock;
	int _n;
	
	public Incrementador(boolean lock, int n){
		_lock = lock;
		_n = n;
	}
	
	public void run(){
		
		for (int i = 0; i<_n; i++){
			if (!_lock){
				Problema1._var = Problema1._var+i;
				_lock = !_lock;
			}
		}
		
	}

}