package ar.edu.iua.ese.doo;

public class PruebaPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona(5555, "Matilda");

		Empleado e1 = new Empleado(123, "Juana", 1.23);
		Empleado e2 = new Empleado(321, "Pedro", 10.18);
		Empleado e3 = new Empleado(123, "hhhhh", 1.23);
		Fruta f1=new Fruta("Manzana");
		
		mostrame(p1);
		mostrame(e1);
		mostrame(f1);
	}
	
	public static void mostrame(Mostrable m) {
		m.mostrar();
	}

}
