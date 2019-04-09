package ar.edu.iua.ese.doo;

public class Divisor {
	
	private double a;
	private double b;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public Divisor(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double dividir() throws DivisionPorCeroException {
		if(b==0)
			throw new DivisionPorCeroException();
		return a/b;
	}
	
	

}
