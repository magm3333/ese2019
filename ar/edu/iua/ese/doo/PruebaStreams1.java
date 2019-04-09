package ar.edu.iua.ese.doo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PruebaStreams1 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String nombre=br.readLine();
		
		System.out.println(nombre );
		
		
		Scanner scanner=new Scanner(System.in);
		nombre=scanner.nextLine();
		System.out.println(nombre);
		
	}

}
