package main;

public class ConsumidorMulti extends Thread{
	
	public ConsumidorMulti(){
		
	}
	
	public void run(){
		int i = 1;
		while (Problema3._val<66){
			if (Problema3._alm.extrae(i)){
				Problema3._val++;
				i++;
			}
		}
		
	}

}
