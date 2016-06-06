package main;

import java.util.ArrayList;

public class AlmacenMultiV1 {
	
	ArrayList<Boolean> _almacenados; 
	int _max;
	
	public AlmacenMultiV1(int max){
		_almacenados = new ArrayList<Boolean>();
		_max = max;
	}
	
	public synchronized boolean Almacena(int n){
		if (_almacenados.size() + n >= _max){
			return false;
		}
		for (int i = 0; i<n; i++){
			_almacenados.add(true);
		}
		return true;
	}
	
	public synchronized boolean extrae(int n){
		if (_almacenados.size()-n <=0){
			return false;
		}
		for (int i = 0; i<n; i++){
			_almacenados.remove(i);
		}
		return true;
	}

}
