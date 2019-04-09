package ar.edu.iua.ese.doo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PruebaEscritura {

	public static void main(String[] args) throws IOException {
		
		Scanner s=new Scanner(System.in);

		
		System.out.print("Ingrese el nombre del archivo: ");
		String archivo=s.nextLine();
		File destino=new File(archivo);
		if(destino.exists()) {
			System.out.println("El archivo existe");
			System.exit(-1);
		}
		try {
			if(!destino.createNewFile()) {
				System.out.println("No se pudo crear el archivo");
				System.exit(-1);
			}
		} catch (IOException e) {
			System.out.println("No se pudo crear el archivo");
			System.exit(-1);
		}
		


		PrintWriter pw=new PrintWriter(destino);
		System.out.print(">");
		String lineaAEscribir=s.nextLine();
		while (!lineaAEscribir.equalsIgnoreCase("exit")) {
			pw.println(lineaAEscribir);
			System.out.print(">");
			lineaAEscribir=s.nextLine();
			pw.flush();
			
		}
		
		
		pw.close();
		
		
	}

}
