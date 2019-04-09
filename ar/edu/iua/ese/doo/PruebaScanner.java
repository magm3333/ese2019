package ar.edu.iua.ese.doo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaScanner {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("/home/mariano/y.sql"));

		long cantidad=0;
		long inicial=System.currentTimeMillis();
		while(scanner.hasNextLine()) {
			String[] palabras=scanner.nextLine().split(" ");
			cantidad+=palabras.length;
		}
		long tiempo=System.currentTimeMillis()-inicial;
		System.out.println("Cantidad de palabras encontradas="+cantidad);
		System.out.println("Tardé "+(tiempo/1000)+" segundos");
	}

}
