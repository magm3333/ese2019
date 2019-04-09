package ar.edu.iua.ese.doo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class HolaMundo {
	
	
	


	public static void main(String[] args) {
		int numero;
		numero = 3;
		int otroNumero = 12;

		if (numero % 2==0) {
			System.out.println("Número es par");
			
		} else {
			System.out.println("Número es impar");
		}
		
		if(otroNumero<3) {
			System.out.println("<3");
		} else if(otroNumero<5) {
			System.out.println("<5");
		} else {
			System.out.println(">5");
		}
		
		if( (numero>0 || numero<5) & numero%2==0) {
			System.out.println("0,5");
		}
		
		do {
			System.out.println("Hola1");
		} while (numero>3);
		
		while(numero>3) {
			System.out.println("Hola");
		}
		int dia=2;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			
		case 2:
			System.out.println("Martes");
			
		case 3:
			System.out.println("Miércoles");
			
		default:
			System.out.println("Ni idea");
			break;
		}

		byte z;
		short a;
		int b;
		long c;
		float f=(float)34.5;
		double d=14.5;
		
		boolean logico=true;
		logico=false;
		
		char ch=65;
		for(int t=0; t<25; t++) {
			System.out.println(ch);
			ch++;
		}
		

	}
	
	

}
