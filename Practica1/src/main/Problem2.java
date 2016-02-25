package main;

public class Problem2 {
	
	Runnable _threads[];
	int _n;
	static int _var = 0;
	
	public Problem2(int n, int m){
		_threads = new Thread[2*n];
		_n = n ;
		for (int i = 0; i<_n; i++){
			_threads[i]=new Problem2runPlus(m);
		}
		for (int i = _n; i<2*_n; i++){
			_threads[i]=new Problem2runMinus(m);
		}
	}
	
	public void Run(){
		for (int i = 0; i<2*_n; i++){
			((Thread) _threads[i]).start();
		}
		for (int i =0; i<2*_n; i++){
			try {
				((Thread) _threads[i]).join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All done! Var = " + _var);
	}

}
