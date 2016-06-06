package main;

public class ProductorMulti extends Thread{
	
	public ProductorMulti(){
		
	}

	public void run(){
		int totalSent = 0;
		while (totalSent < 12){
			if (Problema3._alm.Almacena(3)){
				totalSent+=3;
			}
		}
		
	}
	
}
