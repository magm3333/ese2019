package ar.edu.iua.ese.doo;

public class PruebaMesa {

	public static void main(String[] args) {
		Mesa mesa1=new Mesa(-110,40);
		Mesa copiaMesa1=mesa1;
		Mesa.addMesaFabricada();		
		Mesa mesa2=new Mesa(120,55);
		Mesa.addMesaFabricada();
		

		System.out.println(mesa1.getLargo());
	}

}
