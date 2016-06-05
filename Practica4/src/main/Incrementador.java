package main;

public class Incrementador extends Thread{
	
	int _n;
	
	public Incrementador(int n){
		_n = n;
	}
	
	public void run(){
		for (int i = 0; i<_n; i++){
			Problema.aumenta(i);
		}
	}

}
