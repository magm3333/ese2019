package ar.edu.iua.ese.doo;

public class Persona implements Mostrable{
	private int dni;
	private String nombre;

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Persona(int dni, String nombre) {
		super();
		setDni(dni);
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return String.format("Persona%n\tDNI: %d%n\tNombre: %s", getDni(), getNombre());
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Persona))
			return false;
		return getDni() == ((Persona) obj).getDni();

	}

	@Override
	public void mostrar() {
		System.out.println(toString());
		
	}

}
