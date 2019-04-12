package ar.edu.iua.ese.doo;

class Consumidor implements Runnable {
	private Tuberia tuberia;

	public Consumidor(Tuberia t) {
		tuberia = t;
	}

	public void run() {
		char c;
		for (int i = 0; i < 10; i++) {
			c = tuberia.recoger();
			System.out.println("Consumido " + c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
