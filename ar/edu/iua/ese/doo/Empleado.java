package ar.edu.iua.ese.doo;

public class Empleado extends Persona {

	private double sueldo;

	public double getSueldo() {
		return sueldo;
	}

	/**
	 * Este método establece el valkor del sueldo siempre y cuando sea m ayor que 0
	 * @param sueldo: este es el sueldo de la per
	 */
	public void setSueldo(double sueldo) {
		if (sueldo > 0)
			this.sueldo = sueldo;
	}

	public Empleado(int dni, String nombre, double sueldo) {

		super(dni, nombre);
		setSueldo(sueldo);

	}

	@Override
	public String toString() {
		return String.format(
				"%s%n\tEmpleado%n\t\tSueldo: %s%n", 
				super.toString(), 
				getSueldo());
	}

}
