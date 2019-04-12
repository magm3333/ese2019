package ar.edu.iua.ese.doo;

public class PruebaCopiador {

	public static void main(String[] args)
			throws FSException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// ar.edu.iua.ese.doo.FSUtilsV1
		String implementacion = "ar.edu.iua.ese.doo.FSUtilsV1";
		if (args.length > 0) {
			implementacion = args[0];
		}
		FSUtils copiador = (FSUtils) Class.forName(implementacion).newInstance();

		Origen o = new Origen("/home/mariano/y.sql");
		Destino d = new Destino("/home/mariano/y.copia.sql");
		FSInfo info = copiador.copiar(o, d);
		System.out.println("Bytes copiados " + info.getBytesCopiados());
		System.out.println("Tiempo  " + info.getTiempo() / 1000 + " segundos");

	}

}
