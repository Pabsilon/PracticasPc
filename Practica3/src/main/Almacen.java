package main;

import java.util.ArrayList;

public class Almacen {
	
	ArrayList<Integer> _stock;
	final int _maxLength = 10;
	
	public Almacen(){
		_stock = new ArrayList<Integer>();
	}
	
	public void almacenar(){
		if (_stock.size()<_maxLength){
			_stock.add(1);
			System.out.println("En el almacen hay " + _stock.size() + " elementos!(+1)");
		}
	}
	
	public void extraer(){
		if (_stock.size()>0){
			_stock.remove(_stock.size()-1);
			System.out.println("En el almacen hay " + _stock.size() + " elementos!(-1)");
		}
	}
	
	public boolean status(){
		return !(_stock.size()<_maxLength);
	}
	
	public boolean notEmpty(){
		return (_stock.size()>0);
	}

}
