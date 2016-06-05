package main;

public class Consumidor extends Thread{

	public Consumidor(){
		
	}
	
	public void run(){
		while (Problema2._val < 99){
			if (Problema2._alm.extrae()){
				Problema2._val++;
			}
		}
	}
	
}
