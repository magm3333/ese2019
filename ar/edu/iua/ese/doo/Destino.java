package ar.edu.iua.ese.doo;

import java.io.File;

public class Destino {

	private String destino;

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Destino(String destino) {
		super();
		this.destino = destino;
	}

	public String check() {
		File f = new File(getDestino());
		if (f.exists() && !f.isDirectory())
			return getDestino() + ", existe";
		if (!f.getParentFile().canWrite())
			return "No tiene permisos para escribir en: " + f.getParentFile().getAbsolutePath();
		return null;
	}
}
