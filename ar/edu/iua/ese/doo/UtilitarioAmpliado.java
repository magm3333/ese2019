package ar.edu.iua.ese.doo;

public class UtilitarioAmpliado extends Utilitarios{
	
	
	public int mayor(int a, int b) {
		return 0;
	}
	
	public int mayor(int a, int b, int c) {
		return mayor( mayor(a,b)   ,   c);
	}
	
	public int mayor(int a, int b, int c, int d) {
		return mayor( mayor(a,b,c)   ,   d);
	}
	
	public int mayor(int a, int b, int c, int d, int e) {
		return mayor( mayor(a,b,c, d)   ,   e);
	}
	
	
}
