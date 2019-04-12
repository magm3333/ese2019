package ar.edu.iua.ese.doo;

public class Prueba {
	public static void main(String[] args) {
		Tuberia t = new Tuberia();
		Thread p1 = new Thread(new Productor(t));
		Thread c1 = new Thread(new Consumidor(t));
		p1.start();
		c1.start();
	}
}
