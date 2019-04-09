package ar.edu.iua.ese.doo;

public class Fruta implements Mostrable{

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fruta(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Fruta: "+getNombre();
	}

	@Override
	public void mostrar() {
		System.err.println(toString());
		
	}
}
