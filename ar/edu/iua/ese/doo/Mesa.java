package ar.edu.iua.ese.doo;

public class Mesa {

	public Mesa(int largo, int ancho) {
		setLargo(largo);
		setAncho( ancho);
	}

	private static int cantidadDeMesasFabricadas;

	public static int getCantidadDeMesasFabricadas() {
		return cantidadDeMesasFabricadas;
	}

	public static void addMesaFabricada() {
		cantidadDeMesasFabricadas++;
	}

	private double largo;

	private boolean rota;

	public boolean isRota() {
		return rota;
	}

	public void setRota(boolean rota) {
		this.rota = rota;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		if (largo > 0) {
			this.largo = largo;
		}
	}

	public double getAncho() {

		return ancho;
	}

	public void setAncho(double ancho) {
		if (ancho > 0) {
			this.ancho = ancho;
		}
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private double ancho;

	private double alto;
	private String color;

}
