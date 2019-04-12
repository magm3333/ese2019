package ar.edu.iua.ese.doo;

class Productor implements Runnable {
	private Tuberia tuberia;
	private String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ1234";

	public Productor(Tuberia t) {
		tuberia = t;
	}

	public void run() {
		char c;
		for (int i = 0; i < 10; i++) {
			c = alfabeto.charAt((int) (Math.random() * 26));
			tuberia.lanzar(c);
			System.out.println("Producido " + c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}