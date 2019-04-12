package ar.edu.iua.ese.doo;

import java.io.File;

public class Origen {
	
	private String origen;

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	
	public String check() {
		File f=new File(getOrigen());
		if(!f.exists())
			return getOrigen()+", no existe";
		if(!f.isFile())
			return "No es un archivo";
		if(!f.canRead())
			return "No se puede leer "+getOrigen();
		return null;
	}

	public Origen(String origen) {
		super();
		this.origen = origen;
	}

}
