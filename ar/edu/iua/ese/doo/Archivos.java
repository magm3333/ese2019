package ar.edu.iua.ese.doo;

import java.io.File;

public class Archivos {

	public static void main(String[] args) {
		File f = new File("/home/mariano");
		String[] archivos = f.list(new MiFiltro("."));
		for (String a : archivos) {

			File temp = new File(f, a);
			// if (a.startsWith("a"))
			System.out.printf(
					"%s [%s]%n", 
					a, 
					temp.isFile() ? "archivo" : "carpeta");
		}
		System.out.println(archivos.length + " archivos.");

	}

}
