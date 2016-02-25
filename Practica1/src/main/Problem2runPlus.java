package main;

public class Problem2runPlus extends Thread {

	int _m;
	
	public Problem2runPlus(int m){
		_m = m;
		
	}
	public void run() {
		for (int i = 0; i<_m; i++){
			Problem2._var=Problem2._var+i;
		}
	}

}
