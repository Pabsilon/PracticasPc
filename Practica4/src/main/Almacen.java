package main;

public class Almacen {

	int _stored;
	final int _maxStored = 3;
	
	public Almacen(){
		_stored = 0;
	}
	
	public synchronized boolean almacena(){
		boolean retval = false;
		if (_stored < _maxStored){
			_stored++;
			retval = true;
		}
		return retval;
	}
	
	public synchronized boolean extrae(){
		boolean retval = false;
		if (_stored > 1){
			_stored--;
			retval=true;
		}
		return retval;
	}
	
}
