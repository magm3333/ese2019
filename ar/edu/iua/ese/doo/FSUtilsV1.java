package ar.edu.iua.ese.doo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FSUtilsV1 implements FSUtils {

	@Override
	public FSInfo copiar(Origen origen, Destino destino) throws FSException {
		FSInfo resultado=new FSInfo();
		String mensaje=origen.check();
		if(mensaje!=null)
			throw new FSException(mensaje);
		mensaje=destino.check();
		if(mensaje!=null)
			throw new FSException(mensaje);
		Scanner s;
		PrintWriter pw;
		try {
			 pw=new PrintWriter(destino.getDestino());
			 s=new Scanner(new File(origen.getOrigen()));
		} catch (FileNotFoundException e) {
			throw new FSException(destino.getDestino()+", no existe", e);

		}
		long inicial=System.currentTimeMillis();
		long bytes=0;
		while(s.hasNextLine()) {
			String linea=s.nextLine();
			pw.println(linea);
			bytes+=linea.getBytes().length;
		}
		resultado.setTiempo(System.currentTimeMillis()-inicial);
		resultado.setBytesCopiados(bytes);
		pw.flush();
		pw.close();
		s.close();
		return resultado;
	}
	
	public void hola() {
		
	}

}
