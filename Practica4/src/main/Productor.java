package main;

public class Productor extends Thread{

	public Productor(){
		
	}
	
	public void run(){
		boolean sent = false;
		while (!sent){
			sent = Problema2._alm.almacena();
		}
	}
	
}
