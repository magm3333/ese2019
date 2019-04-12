package ar.edu.iua.ese.doo;

public class Hilo2 implements Runnable {
	boolean cortar=false;
	public boolean isCortar() {
		return cortar;
	}
	public void setCortar(boolean cortar) {
		this.cortar = cortar;
	}
	@Override
	public void run() {
		while(!cortar) {
			System.err.println("Hola desde hilo 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
