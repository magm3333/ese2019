package ar.edu.iua.ese.doo;

public class Tuberia {
	private char contenido;
	private boolean disponible = false;

	public synchronized char recoger() {
		while (disponible == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		disponible = false;
		notifyAll();
		return contenido;
	}

	public synchronized void lanzar(char valor) {
		while (disponible == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contenido = valor;
		disponible = true;
		notifyAll();
	}
}