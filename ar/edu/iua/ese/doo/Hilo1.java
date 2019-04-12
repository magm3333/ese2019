package ar.edu.iua.ese.doo;

public class Hilo1 extends Thread {
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
			System.out.println("Hola desde hilo 1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}

		
	}

}
