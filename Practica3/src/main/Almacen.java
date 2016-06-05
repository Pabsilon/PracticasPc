package main;

public class Almacen {
	
	Boolean _stock;
	
	public Almacen(){
		_stock = false;
	}
	
	public void almacenar(){
		_stock = true;
	}
	
	public void extraer(){
		_stock = false;
	}
	
	public boolean status(){
		return _stock;
	}

}
