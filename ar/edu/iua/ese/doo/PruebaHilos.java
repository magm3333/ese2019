package ar.edu.iua.ese.doo;

public class PruebaHilos {

	public static void main(String[] args) {
		Hilo1 h1=new Hilo1();
		Thread h2=new Thread(new Hilo2());
		
		h1.start();
		h2.start();

	}

}
