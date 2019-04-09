package ar.edu.iua.ese.doo;

import java.io.File;
import java.io.FilenameFilter;

public class MiFiltro implements FilenameFilter {

	private String part;
	public MiFiltro(String part) {
		super();
		this.part = part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	@Override
	public boolean accept(File dir, String name) {
		
		return name.startsWith(getPart());
	}

}
